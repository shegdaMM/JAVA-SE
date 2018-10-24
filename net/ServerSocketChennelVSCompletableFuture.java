import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class ServerSocketChennelVSCompletableFuture
{
  pablic static void main(String[] args)
  {
        try (final AsynchronousServerSocketChannel listener = 
          AsynchronousServerSocketChannel.open()) {

              listener.setOption(StandardSocketOptions.SO_REUSEADDR, true);
              listener.bind(new InetSocketAddress("localhost", 8080));

              while (true) {      

                  AsynchronousSocketChannel connection = listener.accept().get();
                  CompletableFuture<AsynchronousSocketChannel> connectionPromise = 
                      CompletableFuture.completedFuture(connection);

                  CompletableFuture<ByteBuffer> readerPromise = CompletableFuture.supplyAsync(() -> {
                      ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
                      try {
                          connection.read(buffer).get();
                          return (ByteBuffer) buffer.flip();
                      } catch (InterruptedException | ExecutionException e) {
                          connectionPromise.completeExceptionally(e);
                      } 
                      return null;
                  });

                  readerPromise.thenAcceptAsync((buffer) -> {
                      if (buffer != null) {
                          try {
                              connection.write(buffer).get();
                              connection.close();
                          } catch (InterruptedException | ExecutionException | IOException e) {
      readerPromise.completeExceptionally(e);
                          } 
                      }
                  });
              }

          } catch (IOException | InterruptedException | ExecutionException e) {
              e.printStackTrace();
      }



import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.CompletableFuture;

public class FutureSocketChannel {

    private AsynchronousSocketChannel asc;  //socket

    public FutureSocketChannel() throws IOException {
        this.asc = AsynchronousSocketChannel.open();  //free port socket
    }

    protected FutureSocketChannel(AsynchronousSocketChannel asc) { 
        this.asc = asc; //paremetr socket to class variable
    }

    public void close() {
        try {
            asc.close(); // command of close this socket
        } catch (IOException e) {
            // Ignore
        }
    }

    public CompletableFuture<Void> connect(SocketAddress sa) {
        CompletableFuture<Void> connector = new CompletableFuture<>(); //
        asc.connect(sa, connector, new CompletionHandler<Void, CompletableFuture<Void>>() {
            public void completed(Void v1, CompletableFuture<Void> connector) {
                connector.complete(null);
            }

            public void failed(Throwable th, CompletableFuture<Void> connector) {
                connector.completeExceptionally(th);
            }
        });
        return connector;
    }

    public CompletableFuture<Integer> read(ByteBuffer buffer) {
        CompletableFuture<Integer> reader = new CompletableFuture<>();
        asc.read(buffer, reader, new CompletionHandler<Integer, CompletableFuture<Integer>>() {
            public void completed(Integer length, CompletableFuture<Integer> reader) {
                reader.complete(length);
            }

            public void failed(Throwable th, CompletableFuture<Integer> reader) {
                reader.completeExceptionally(th);
            }
        });
        return reader;
    }

    public CompletableFuture<Integer> write(ByteBuffer buffer) {
        CompletableFuture<Integer> writer = new CompletableFuture<>();
        asc.write(buffer, writer, new CompletionHandler<Integer, CompletableFuture<Integer>>() {
            public void completed(Integer length, CompletableFuture<Integer> writer) {
                writer.complete(length);
            }

            public void failed(Throwable th, CompletableFuture<Integer> writer) {
                writer.completeExceptionally(th);
            }
        });
        return writer;
    }

    public int getPort() throws IOException {
        return ((InetSocketAddress)asc.getLocalAddress()).getPort();
    }
}

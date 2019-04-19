
/*
На­пи­ши­те программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел на­хо­дит сред­нее ариф­ме­ти­че­ское чисел, крат­ных 8, или сообщает, что таких чисел нет (выводит «NO»). Про­грам­ма по­лу­ча­ет на вход на­ту­раль­ные числа, ко­ли­че­ство введённых чисел неизвестно,последовательность чисел за­кан­чи­ва­ет­ся чис­лом 0 (0 – при­знак окон­ча­ния ввода, не вхо­дит в последовательность).

Количество чисел не пре­вы­ша­ет 100. Введённые числа не пре­вы­ша­ют 300. Про­грам­ма долж­на вы­ве­сти сред­нее ариф­ме­ти­че­ское чисел, крат­ных 8, или вы­ве­сти «NO», если таких чисел нет. Зна­че­ние вы­во­дить с точ­но­стью до десятых.

Sample Input:

8
122
64
16
0
Sample Output:

29,3
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int sum=0,n=0; 
        Scanner in=new Scanner(System.in); 
            while(in.hasNextInt())
            {
                String str=in.next();
                if (str.startsWith("−")) str=str.replace("−","-");  
                int ch=Integer.parseInt(str);
                if (ch!=0)
                {
                    if (ch%8==0) {sum+=ch; n++;} 
                }
            }
        String res=String.format("%1$.1f",(double)sum/n);
        res=res.replace(".",",");
         System.out.println((sum>0)? res : "NO");
    }
}
/*
Напишите программу, которая выводит все четные числа от 10 до 20

Sample Input:

Sample Output:

10 12 14 16 18 20
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int start=10,n=20; 
            while(start<=n)
            {
                if (start%2==0)
                {
                  System.out.print(start+" "); 
                }
                start+=2;
            }
    }
}
/*
Вводятся целые числа a и b. Гарантируется, что a не превосходит b.  Выведите (через пробел) все четные числа от a до b (включительно).
Sample Input:

2
5
Sample Output:

2 4
*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int start=in.nextInt();
        int n=in.nextInt();
            while(start<=n)
            {
                if (start%2==0)
                {
                  System.out.print(start+" "); 
                }
                start++;
            }
    }
}
/*
Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно. 

Sample Input:

Sample Output:

100 121 144 169 196 225 256 289 324 361 400
*/
class Main {
    public static void main(String[] args) {
        int start=10;
        int n=20;
            while(start<=n)
            {
                System.out.print((start*start)+" "); 
                start++;
            }
    }
}
/*
В бригаде, работающей на уборке сена, имеется N косилок. Первая из них работала M часов, а каждая следующая на 10 минут больше, чем предыдущая. Сколько часов проработала вся бригада?
Sample Input:

2
2
Sample Output:

4
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int m=in.nextInt(); m=m*60;
        int sum=0,i=1;
            while(i<=n)
            {
                sum+=m;     
                m+=10;
                i++;
            }
        int hours=sum/60; 
       // int minute=sum%60; 
      // System.out.println((minute>0)? (hours+","+ minute) : hours);
      System.out.print(hours);
    }
}
/*
В магазин ежедневно приходит какое-то количество посетителей.
Входные данные: сколько человек посетило магазин за день, ввести возраст каждого посетителя
Выходные данные:  показать возраст самого старшего и самого молодого из них, а так же посчитать средний возраст посетителей.
Sample Input:

3
56
45
25
Sample Output:

Средний возраст всех посетителей: 42

Самый взрослый: 56

Самый молодой: 25
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int[] st=IntStream.generate(()->in.nextInt()).limit(n).toArray();
		int abs=(Arrays.stream(st).sum())/n;
        int min=Arrays.stream(st).min().getAsInt();
        int max=Arrays.stream(st).max().getAsInt();
        System.out.println("Средний возраст всех посетителей: "+abs+"\n");
        System.out.println("Самый взрослый: "+max+"\n");
        System.out.println("Самый молодой: "+min+"\n");
    }
}
/*
На­пи­ши­те программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет мак­си­маль­ное число, крат­ное 5. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, крат­ное 5. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число — максимальное число, крат­ное 5. 

Sample Input:

3
10
25
12
Sample Output:

25
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int[] st=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%5==0).toArray();
        int max=Arrays.stream(st).max().getAsInt();
        System.out.println(max);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет сумму чисел, крат­ных 6. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, крат­ное 6. Ко­ли­че­ство чисел не пре­вы­ша­ет 100. Введённые числа не пре­вы­ша­ют 300. Про­грам­ма долж­на вы­ве­сти одно число — сумму чисел, крат­ных 6. 

Sample Input:

3
12
25
6
Sample Output:

18
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int sum=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%6==0).sum(); 
        System.out.println(sum);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ко­ли­че­ство чисел, крат­ных 4. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, крат­ное 4. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число — количество чисел, крат­ных 4.
Sample Input:

3
16
26
24
Sample Output:

2
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long count=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%4==0).count(); 
        System.out.println(count);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ми­ни­маль­ное число, крат­ное 3. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, крат­ное 3. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число — минимальное число, крат­ное 3.
Sample Input:

3
21
12
31
Sample Output:

12
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int min=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%3==0).min().getAsInt();
        System.out.println(min);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет сумму чисел, крат­ных 3. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, крат­ное 3. Ко­ли­че­ство чисел не пре­вы­ша­ет 100. Введённые числа не пре­вы­ша­ют 300. Про­грам­ма долж­на вы­ве­сти одно число — сумму чисел, крат­ных 3.

Sample Input:

3
12
25
9
Sample Output:

21
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int sum=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%3==0).sum();
        System.out.println(sum);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ко­ли­че­ство чисел, крат­ных 6. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, крат­ное 6.
Sample Input:

3
18
26
24
Sample Output:

2
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long count=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%6==0).count();
        System.out.println(count);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет мак­си­маль­ное число, крат­ное 4. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, крат­ное 4. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число — максимальное число, крат­ное 4.
Sample Input:

3
8
16
11
Sample Output:

16
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long max=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%4==0).max().getAsInt();
        System.out.println(max);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет сумму чисел, окан­чи­ва­ю­щих­ся на 4. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, окан­чи­ва­ю­ще­е­ся на 4. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число — сумму чисел, окан­чи­ва­ю­щих­ся на 4.
Sample Input:

3
14
25
24
Sample Output:

38
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long sum=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%10==4).sum();
        System.out.println(sum);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ко­ли­че­ство чисел, окан­чи­ва­ю­щих­ся на 3. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, окан­чи­ва­ю­ще­е­ся на 3. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число — количество чисел, окан­чи­ва­ю­щих­ся на 3.
Sample Input:

3
13
23
24
Sample Output:

2
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long count=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%10==3).count();
        System.out.println(count);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет мак­си­маль­ное число, окан­чи­ва­ю­ще­е­ся на 3. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, окан­чи­ва­ю­ще­е­ся на 3. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число — максимальное число, окан­чи­ва­ю­ще­е­ся на 3.
Sample Input:

3
13
23
3
Sample Output:

23
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long max=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%10==3).max().getAsInt();
        System.out.println(max);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет сумму чисел, окан­чи­ва­ю­щих­ся на 3. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, окан­чи­ва­ю­ще­е­ся на 3. Ко­ли­че­ство чисел не пре­вы­ша­ет 100. Введённые числа не пре­вы­ша­ют 300. Про­грам­ма долж­на вы­ве­сти одно число — сумму чисел, окан­чи­ва­ю­щих­ся на 3.
Sample Input:

3
13
23
24
Sample Output:

36
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long sum=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%10==3).sum();
        System.out.println(sum);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ко­ли­че­ство чисел, окан­чи­ва­ю­щих­ся на 6. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, окан­чи­ва­ю­ще­е­ся на 6. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число — ко­ли­че­ство чисел, окан­чи­ва­ю­щих­ся на 6.
Sample Input:

3
16
26
24
Sample Output:

2
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long count=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%10==6).count();
        System.out.println(count);

    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ми­ни­маль­ное число, окан­чи­ва­ю­ще­е­ся на 4. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, окан­чи­ва­ю­ще­е­ся на 4. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число — ми­ни­маль­ное число, окан­чи­ва­ю­ще­е­ся на 4.
Sample Input:

3
24
14
34
Sample Output:

14
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long count=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%10==4).min().getAsInt();
        System.out.println(count);

    }
}
/*
Напишите программу, которая в последовательности натуральных чисел определяет сумму чисел, кратных 5. Программа получает на вход количество чисел в последовательности, а затем сами числа. В последовательности всегда имеется число, кратное 5. Количество чисел не превышает 100. Введённые числа не превышают 300. Программа должна вывести одно число — сумму чисел, кратных 5.
Sample Input:

3
15
25
6
Sample Output:

40
*/
import java.util.*;

class Main 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int sum=0;
        //int[] arr=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%10==5).toArray();
        for(int i=0;i<n;i++) 
        {    
          int ch=in.nextInt();
          if(ch%5==0) {sum=sum+ch;}
        }
        System.out.println(sum);
     
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ко­ли­че­ство чисел, крат­ных 3. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, крат­ное 3. Ко­ли­че­ство чисел не пре­вы­ша­ет 100. Введённые числа не пре­вы­ша­ют 300. Про­грам­ма долж­на вы­ве­сти одно число — ко­ли­че­ство чисел, крат­ных 3.
Sample Input:

3
12
26
24
Sample Output:

2
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long count=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->a%3==0).count();
        System.out.println(count);

    }
}
/*
Напишите про­грам­му для ре­ше­ния сле­ду­ю­щей задачи. Ка­ме­ра на­блю­де­ния ре­ги­стри­ру­ет в ав­то­ма­ти­че­ском ре­жи­ме ско­рость про­ез­жа­ю­щих мимо неё автомобилей, округ­ляя зна­че­ния ско­ро­сти до целых чисел. Не­об­хо­ди­мо опре­де­лить мак­си­маль­ную за­ре­ги­стри­ро­ван­ную ско­рость автомобиля. Если ско­рость хотя бы од­но­го ав­то­мо­би­ля была мень­ше 30 км/ч, вы­ве­ди­те «YES», иначе вы­ве­ди­те «N0».

Программа по­лу­ча­ет на вход число про­ехав­ших ав­то­мо­би­лей N (1 < N < 30), затем ука­зы­ва­ют­ся их скорости. Зна­че­ние ско­ро­сти не может быть мень­ше 1 и боль­ше 300.Программа долж­на сна­ча­ла вы­ве­сти мак­си­маль­ную скорость, затем YES или NO.

Sample Input:

4
74
69
63
66
Sample Output:

74
NO
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int[] mass=IntStream.generate(()->in.nextInt()).limit(n).toArray();
        
        System.out.println(Arrays.stream(mass).max().getAsInt());
        long min=Arrays.stream(mass).filter((a)->a<30).count();
        System.out.println((min>0)?"YES":"NO");

    }
}
/*
Напишите про­грам­му для ре­ше­ния сле­ду­ю­щей задачи. Ка­ме­ра на­блю­де­ния ре­ги­стри­ру­ет в ав­то­ма­ти­че­ском ре­жи­ме ско­рость про­ез­жа­ю­щих мимо неё автомобилей, округ­ляя зна­че­ния ско­ро­сти до целых чисел. Не­об­хо­ди­мо опре­де­лить ми­ни­маль­ную за­ре­ги­стри­ро­ван­ную ско­рость автомобиля. Если ско­рость хотя бы од­но­го ав­то­мо­би­ля была боль­ше 80 км/ч, вы­ве­ди­те «YES», иначе вы­ве­ди­те «NO».

Программа по­лу­ча­ет на вход число про­ехав­ших ав­то­мо­би­лей N (1 ≤ N ≤ 30), затем ука­зы­ва­ют­ся их скорости. Зна­че­ние ско­ро­сти не может быть мень­ше 1 и боль­ше 300.Программа долж­на сна­ча­ла вы­ве­сти ми­ни­маль­ную скорость, затем YES или NO.

Sample Input:

4
74
69
63
96
Sample Output:

63
YES
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int[] mass=IntStream.generate(()->in.nextInt()).limit(n).toArray();
        
        System.out.println(Arrays.stream(mass).min().getAsInt());
        long max=Arrays.stream(mass).filter((a)->a>80).count();
        System.out.println((max>0)?"YES":"NO");

    }
}
/*
Напишите про­грам­му для ре­ше­ния следующей задачи. Ка­ме­ра наблюдения ре­ги­стри­ру­ет в ав­то­ма­ти­че­ском режиме ско­рость проезжающих мимо неё автомобилей, округ­ляя значения ско­ро­сти до целых чисел. Не­об­хо­ди­мо определить среднюю зарегистрированную скорость всех автомобилей. Если ско­рость хотя бы од­но­го автомобиля была не мень­ше 60 км/ч, вы­ве­ди­те «YES», иначе вы­ве­ди­те «NO».

Программа по­лу­ча­ет на вход число про­ехав­ших автомобилей N (1 ≤ N ≤ 30), затем ука­зы­ва­ют­ся их скорости. Зна­че­ние скорости не может быть мень­ше 1 и боль­ше 300. Про­грам­ма должна сна­ча­ла вывести сред­нюю скорость с точ­но­стью до од­но­го знака после запятой, затем «YES» или «NO».

Sample Input:

4
74
69
63
96
Sample Output:

75.5
YES
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int sum=0,max=0; 
        while(in.hasNextInt())
        {
            int ch=in.nextInt();
            if (ch>max) max=ch;
            sum+=ch;
        }
        double sr=(double)sum/n;
        String res=String.format("%1$.1f",sr);
        System.out.println((sr==((int)sr))? (int)sr : res);
        System.out.println((max>=60)?"YES":"NO");

    }
}
/*
Напишите про­грам­му для ре­ше­ния сле­ду­ю­щей задачи. Ка­ме­ра на­блю­де­ния ре­ги­стри­ру­ет в ав­то­ма­ти­че­ском ре­жи­ме ско­рость про­ез­жа­ю­щих мимо неё автомобилей, округ­ляя зна­че­ния ско­ро­сти до целых чисел. Не­об­хо­ди­мо опре­де­лить сред­нюю за­ре­ги­стри­ро­ван­ную ско­рость всех автомобилей. Если не менее двух ав­то­мо­би­лей дви­га­лись со ско­ро­стью не боль­ше 40 км/ч, вы­ве­ди­те «YES», иначе вы­ве­ди­те «NO».

Программа по­лу­ча­ет на вход число про­ехав­ших ав­то­мо­би­лей N (1 ≤ N ≤ 30), затем ука­зы­ва­ют­ся их скорости. Зна­че­ние ско­ро­сти не может быть мень­ше 1 и боль­ше 300.Программа долж­на сна­ча­ла вы­ве­сти сред­нюю скорость, затем «YES» или «NO».

Sample Input:

4
74
69
63
96
Sample Output:

76
NO
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int sum=0,count=0; 
        while(in.hasNextInt())
        {
            int ch=in.nextInt();
            if (ch<40) count++;
            sum+=ch;
        }
        double sr=(double)sum/n;
        System.out.println(Math.round(sr));
        System.out.println((count>=2)?"YES":"NO");

    }
}
/*
Напишите про­грам­му для ре­ше­ния сле­ду­ю­щей задачи. Ка­ме­ра на­блю­де­ния ре­ги­стри­ру­ет в ав­то­ма­ти­че­ском ре­жи­ме ско­рость про­ез­жа­ю­щих мимо неё автомобилей, округ­ляя зна­че­ния ско­ро­сти до целых чисел. Не­об­хо­ди­мо определить:

1)	разность мак­си­маль­ной и ми­ни­маль­ной ско­ро­стей автомобилей;

2)	количество автомобилей, ско­рость ко­то­рых не пре­вы­ша­ла 30 км/ч.

Программа по­лу­ча­ет на вход число про­ехав­ших ав­то­мо­би­лей N (1 ≤ N ≤ 30), затем ука­зы­ва­ют­ся их скорости. Зна­че­ние ско­ро­сти не может быть мень­ше 1 и боль­ше 300. Про­грам­ма долж­на сна­ча­ла вы­ве­сти раз­ность мак­си­маль­ной и ми­ни­маль­ной ско­ро­стей автомобилей, затем ко­ли­че­ство автомобилей, ско­рость ко­то­рых не пре­вы­ша­ла 30 км/ч.

Sample Input:

4
74
69
63
96
Sample Output:

33
0
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int max=0,min=999,count=0; 
        while(in.hasNextInt())
        {
            int ch=in.nextInt();
            if (ch<30) count++;
            if (ch<min) min=ch;
            if (ch>max) max=ch;
        }
        System.out.println(Math.round(max-min));
        System.out.println(count);

    }
}
/*
Введите с кла­ви­а­ту­ры 5 по­ло­жи­тель­ных целых чисел. Вы­чис­ли­те сумму тех из них, ко­то­рые де­лят­ся на 4 и при этом за­кан­чи­ва­ют­ся на 6. Про­грам­ма долж­на вы­ве­сти одно число: сумму чисел, вве­ден­ных с клавиатуры, крат­ных 4 и окан­чи­ва­ю­щих­ся на 6.
Sample Input:

12
16
36
26
30
Sample Output:

52
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        
        long sum=IntStream.generate(()->in.nextInt()).limit(5).filter((a)->(a%4==0)&&(a%10==6)).sum();
        System.out.println(sum);

    }
}
/*
Введите с кла­ви­а­ту­ры 8 по­ло­жи­тель­ных целых чисел. Определите, сколь­ко из них де­лят­ся на 3 и при этом за­кан­чи­ва­ют­ся на 4. Про­грам­ма должна вы­ве­сти одно число: ко­ли­че­ство чисел, крат­ных 3 и окан­чи­ва­ю­щих­ся на 4.
Sample Input:

12
14
24
54
44
33
84
114
Sample Output:

4
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        
        long sum=IntStream.generate(()->in.nextInt()).limit(8).filter((a)->(a%3==0)&&(a%10==4)).count();
        System.out.println(sum);

    }
}
/*
На­пи­ши­те программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ми­ни­маль­ное чётное число.

Программа по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся чётное число. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000.

Программа долж­на вы­ве­сти одно число — ми­ни­маль­ное чётное число.

Sample Input:

4
3
20
6
8
Sample Output:

6
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long sum=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->(a%2==0)).min().getAsInt();
        System.out.println(sum);

    }
}
/*
На­пи­ши­те программу, ко­то­рая в по­сле­до­ва­тель­но­сти натуральных чисел опре­де­ля­ет максимальное число, окан­чи­ва­ю­ще­е­ся на 2.

Программа по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти всегда име­ет­ся число, окан­чи­ва­ю­ще­е­ся на 2.

Количество чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма должна вы­ве­сти одно число — мак­си­маль­ное число, окан­чи­ва­ю­ще­е­ся на 2.

Sample Input:

4
3
22
6
12
Sample Output:

22
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long sum=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->(a%10==2)).max().getAsInt();
        System.out.println(sum);

    }
}
/*
На­пи­ши­те про­грам­му для ре­ше­ния сле­ду­ю­щей задачи. Де­вя­ти­класс­ни­ки участ­во­ва­ли в вик­то­ри­не по математике. Не­об­хо­ди­мо было от­ве­тить на 20 вопросов. По­бе­ди­те­лем вик­то­ри­ны счи­та­ет­ся участник, пра­виль­но от­ве­тив­ший на наи­боль­шее ко­ли­че­ство вопросов. На сколь­ко во­про­сов по­бе­ди­тель от­ве­тил правильно? Если есть участ­ни­ки викторины, ко­то­рые не смог­ли дать пра­виль­ный ответ ни на один из вопросов, вы­ве­ди­те YES, иначе вы­ве­ди­те NO. Гарантируется, что есть участники, пра­виль­но от­ве­тив­шие хотя бы на один из вопросов. Про­грам­ма по­лу­ча­ет на вход число участ­ни­ков вик­то­ри­ны N (1 ≤ N ≤ 50), затем для каж­до­го участ­ни­ка вво­дит­ся ко­ли­че­ство вопросов, на ко­то­рые по­лу­чен пра­виль­ный ответ.
Sample Input:

4
15
12
0
17
Sample Output:

17
YES
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int[] arr=IntStream.generate(()->in.nextInt()).limit(n).toArray();
        System.out.println(Arrays.stream(arr).max().getAsInt());
        boolean non=(Arrays.stream(arr).min().getAsInt())==0;
        System.out.println((non)? "YES":"NO");

    }
}
/*
На­пи­ши­те про­грам­му для ре­ше­ния сле­ду­ю­щей задачи. Уче­ни­ки 4 клас­са вели днев­ни­ки на­блю­де­ния за по­го­дой и еже­днев­но за­пи­сы­ва­ли днев­ную температуру. Най­ди­те самую низ­кую тем­пе­ра­ту­ру за время наблюдения. Если тем­пе­ра­ту­ра опус­ка­лась ниже –15 градусов, вы­ве­ди­те YES, иначе вы­ве­ди­те NO. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство дней, в те­че­ние ко­то­рых про­во­ди­лось из­ме­ре­ние тем­пе­ра­ту­ры N (1 ≤ N ≤ 31), затем для каж­до­го дня вво­дит­ся температура.
Sample Input:

4
-5
12
-2
8
Sample Output:

-5
NO
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int[] arr=IntStream.generate(()->in.nextInt()).limit(n).toArray();
        System.out.println(Arrays.stream(arr).min().getAsInt());
        boolean non=(Arrays.stream(arr).min().getAsInt())<-15;
        System.out.println((non)? "YES":"NO");

    }
}
/*
На­пи­ши­те программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ко­ли­че­ство чисел, крат­ных 3 и окан­чи­ва­ю­щих­ся на 2. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа по мо­ду­лю не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число: ко­ли­че­ство чисел, крат­ных 3 и окан­чи­ва­ю­щих­ся на 2.
Sample Input:

4
12
25
12
9
Sample Output:

2
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long col=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->(a%3==0)&&(a%10==2)).count();
        System.out.println(col);

    }
}
/*
На­пи­ши­те программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ко­ли­че­ство чисел, крат­ных 6 и окан­чи­ва­ю­щих­ся на 4. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа по мо­ду­лю не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число: ко­ли­че­ство чисел, крат­ных 6 и окан­чи­ва­ю­щих­ся на 4.
Sample Input:

3
24
25
54
Sample Output:

2
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        long col=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->(a%6==0)&&(a%10==4)).count();
        System.out.println(col);

    }
}
/*
На­пи­ши­те программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет мак­си­маль­ное число, окан­чи­ва­ю­ще­е­ся на 3. Про­грам­ма по­лу­ча­ет на вход ко­ли­че­ство чисел в последовательности, а затем сами числа. В по­сле­до­ва­тель­но­сти все­гда име­ет­ся число, окан­чи­ва­ю­ще­е­ся на 3. Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число — мак­си­маль­ное число, оканчивающееся на 3.

Sample Input:

3
13
23
3
Sample Output:

23
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int max=IntStream.generate(()->in.nextInt()).limit(n).filter((a)->(a%10==3)).max().getAsInt();
        System.out.println(max);

    }
}
/*
Напишите программу для решения следующей задачи. Ученики 4 класса вели дневники наблюдения за погодой и ежедневно записывали дневную температуру. Найдите среднюю температуру за время наблюдения. Если количество дней, когда температура поднималась выше нуля градусов, не менее 5, выведите YES, иначе выведите NO. Программа получает на вход количество дней, в течение которых проводилось наблюдение N(1 ≤ N ≤ 31), затем для каждого дня вводится температура.
Sample Input:

4
-4
12
-2
8
Sample Output:

3.5

NO
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int sum=0,count=0; 
        
        while(in.hasNextInt())
        {
            int ch=in.nextInt();
            if (ch>0) count++;
            sum=sum+ch;
        }
        double res=sum/(double)n;         
        int resi=(int)res;         
 
        if ((res-resi)>0)  System.out.println(res);
        else System.out.println(resi);

        System.out.println();
        System.out.println(count>5 ? "YES":"NO");

    }
}
/*
Напишите программу для решения следующей задачи. На контрольной работе по алгебре ученикам 9 класса было предложено 10 примеров. Неудовлетворительная оценка выставляется, если правильно решено менее половины примеров. Сколько неудовлетворительных оценок было получено учениками? Если хотя бы один из учеников правильно решил все задачи, выведите YES, иначе выведите NO. Программа получает на вход количество учеников в классе N (1 ≤ N ≤ 30), затем для каждого ученика вводится количество правильно решённых примеров.
Sample Input:

4
3
9
2
8
Sample Output:

2

NO
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        boolean is10=false; 
        int sum=0,count=0; 
        while(in.hasNextInt())
        {
            int ch=in.nextInt();
            if (ch==10) is10=true;
            if (ch<5) count++;
        }    
        System.out.println(count);
        System.out.println();
        System.out.println(is10 ? "YES":"NO");
    }
}


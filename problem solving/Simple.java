//простые в решении задачки, реализованные в качестве тренировок
/*
Напишите программу, которая приветствует нового пользователя. В соответствии с примером.
Sample Input:

Peter
Sample Output:

Welcome, Peter!
*/
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
      String name = new Scanner(System.in).nextLine();
      System.out.println("Welcome, "+name+"!");
    }
}

/*
Напишите программу, которая считает введенные числа по следующей формуле a+b-c. Первое число вводиться с, второе b, третье а.
Sample Input:

8
6
8
Sample Output:

6
*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int b = s.nextInt();
        int a = s.nextInt();
        System.out.println(a+b-c);
    }
}
/*
Напишите программу, которая выводит первые две цифры трехзначного числа
Sample Input:

341
Sample Output:

34
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int a=s.nextInt();
       int result=a/10;
       System.out.println(result);
    }
}
/*
Напишите программу, которая получает на вход двухзначное неотрицательное число. Если сумма цифр этого числа двухзначное число выводиться 1, если сумма цифр однозначное число выводиться 0.

Нельзя использовать условные конструкции.
Sample Input:

36
Sample Output:

0
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int in=s.nextInt();
       System.out.println(solution(in));
    }
    private static int solution(int in){
       int a=in/10;
       int b=in-a*10;
       if ((a+b)<10) return 0;
        else return 1;
    }
}
/*
Напишите программу, которая переводит числа из двоичной системы счисления в десятичную систему счисления.

На вход программа получает любое двоичное число не превышающее трех разрядов.

На выходе программа выводит введенное число в десятичной системе счисления.

Sample Input:

111
Sample Output:

7
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String in=s.nextLine();
        int result=0;
        for(int i=in.length()-1, t=1; i>=0;i--)
        {   
            if(in.charAt(i)=='1') {result+=t;}
            t=t*2; 
        }
        System.out.println(result);
    }
}
/*
Напишите программу, которая возводит введенное число во третью степень.

Sample Input:

2
Sample Output:

8
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int chislo=s.nextInt();
        System.out.println(chislo*chislo*chislo);
    }
}
/*
Напишите программу, которая получает на вход любое двухзначное число и если в данном числе есть цифра 9 программа выводит 3, если нет любое другое число. 
Sample Input:

19
Sample Output:

3
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int chislo=s.nextInt();
        int a=(chislo/10);
        int b=(chislo-a*10);
        if ((a==9) ||(b==9)) System.out.println(3);
        else System.out.println(8);
    }
}
/*
Напишите программу, которая получает на вход любое двухзначное число. Если в числе есть цифра 5, то программа выводит цифру которое находится рядом. Если нет выводит любое другое число.

Sample Input:

35
Sample Output:

3
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int chislo=s.nextInt();
        int a=(chislo/10);
        int b=(chislo-a*10);
        if (a==5) System.out.println(b); 
        else if (b==5) System.out.println(a); 
            else  System.out.println(8);
    }
}
/*
Даны 3 корзины с яблоками. Необходимо определить сколько яблок в двух самых больших корзинках.

Sample Input:

1
2
3
Sample Output:

5
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] korzina=new int[3]; 
        int result=0;
        for(int i=0;i!=korzina.length;i++)
        {
            korzina[i]=s.nextInt();
        }
        int min=Arrays.stream(korzina).min().getAsInt();
        result= Arrays.stream(korzina).sum()-min;
        System.out.println(result);
    }
}
/*
На книжной полке стоят 3 книги. Каждая книга пронумированна определенным числом. Необходимо растравить книги в порядке возрастания.

Sample Input:

4
6
2
Sample Output:

2 4 6
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        IntStream. generate(()->s.nextInt()).limit(3).sorted().forEach((a)->System.out.print(a+" "));
        //IntStream.of(s.nextInt()).sorted().forEach((a)->System.out.print(a+" "));
 
    //   int min=Arrays.stream(korzina).min().getAsInt();
     //   result=Arrays.stream(korzina).sum()-min();
      //  System.out.println(result);
    }
}
/*
Определить, кратно ли заданное число трем; если нет, вывести остаток. Если кратно вывести YES
Sample Input:

12
Sample Output:

YES
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        if(c%3==0) System.out.println("YES");
        else System.out.println(c%3);
    }
}
/*
В каждую крайнюю клетку квадратной доски поставили по фишке. Могло ли оказаться, что выставлено ровно k фишек? (Например, если доска 2 x 2, то выставлено 4 фишки, а если 6 x 6 - то 20). 
Вводится одно натуральное число k.
Sample Input:

4
Sample Output:

YES
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        if((k%4==0)&&(k>0)) System.out.println("YES");
        else System.out.println("NO");
    }
}
/*
Билет на одну поездку в метро стоит 15 рублей, билет на 10 поездок стоит 125 рублей, билет на 60 поездок стоит 440 рублей. Пассажир планирует совершить n поездок. Определите, сколько билетов каждого вида он должен приобрести, чтобы суммарное количество оплаченных поездок было не меньше n, а общая стоимость приобретенных билетов – минимальна.  
Дано одно число n - количество поездок. Выведите три целых числа, равные необходимому количеству билетов на 1, на 10, на 60 поездок.
Sample Input:

10
Sample Output:

0 1 0
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r60=0,r10=0;
        if(n>0){
        if((n/60)>0) {r60=n/60; n=n%60;}
        if((n/10)>0) {r10=n/10; n=n%10;}
        System.out.println(n+" "+r10+" "+r60);}
        else System.out.println("0 0 0");
    }
}
/*
Дано два трехзначных числа. Необходимо написать программу, которая определяет есть ли в этих числах цифра 3. Если цифра 3 есть только в одном числе выводиться YES, если числ с цифрой 3 нет выводиться NO. А если в двух числах есть цифра 3 выводиться большее из них.
Sample Input:

341
552
Sample Output:

YES
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        if ((testFor3(n1))^(testFor3(n2))) System.out.println("YES");
        else if ((testFor3(n1))&&(testFor3(n2))) System.out.println(IntStream.of(n1,n2).max().getAsInt());
            else System.out.println("NO");

    }
    public static boolean testFor3(int i)
    {
        int n=0;   
        if ((i/100==3)|| ((i%100)/10==3) || (((i%100)%10)==3)) return true;
        else return false;
    }
}
/*
Дано любое положительное число не превышающее 99999. Необходимо написать программу, которая будет определять количество четных цифр в введенном числе.

Sample Input:

134
Sample Output:

1
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ch=s.nextInt();
        int res=0; 
        while(ch!=0)
        {
            int q=ch%10; 
            if  (q%2==0) res++;
            ch=ch/10;  
        }
        System.out.println(res);
    }
}
/*
Напишите программу, которая получает на вход число n и выводит все цифры от 0 до n. Гарантируется, что n>0.

Sample Input:

3
Sample Output:

0
1
2
3
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
/*
Напишите программу, которая получает на вход положительное число. Если введенное число четное выводятся все четные числа до этого числа, если нечетное выводятся все нечетные числа до этого числа.

Sample Input:

5
Sample Output:

1
3
5
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        while(i<=n)
        {
            if((i%2!=0) && (n%2!=0)) System.out.println(i);
            if((i%2==0) && (n%2==0)) System.out.println(i);
            i++;
        }
    }
}
/*
Напишите программу, которая получает на вход два целых числа, выводит все числа между ними от первого до второго числа.

Sample Input:

3
7
Sample Output:

3
4
5
6
7
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int n=s.nextInt();
        if (i<n){
            while(i<=n)
            {
                System.out.println(i);
                i++;
            }
        }
        else {
            while(i>=n)
            {
                System.out.println(i);
                i--; 
            }
        }
    }
}

/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет опре­де­ля­ет сумму всех чисел, крат­ных 6 и окан­чи­ва­ю­щих­ся на 4. Про­грам­ма по­лу­ча­ет на вход на­ту­раль­ные числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся чис­лом 0 (0 — признак окон­ча­ния ввода, не вхо­дит в последовательность). Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число: сумму всех чисел, крат­ных 6 и окан­чи­ва­ю­щих­ся на 4. 

Sample Input:

14
24
144
22
12
0
Sample Output:

168
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int res=0;
        Scanner s=new Scanner(System.in);
            while(s.hasNextInt())
            {
                int ch=s.nextInt();
                if((ch%6==0)&&(ch%10==4)) res=res+ch; 
            }
         System.out.println(res);
      
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти целых чисел опре­де­ля­ет ко­ли­че­ство нечётных чисел, крат­ных 3. Про­грам­ма по­лу­ча­ет на вход целые числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся чис­лом 0 (0 — признак окон­ча­ния ввода, не вхо­дит в последовательность). Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа по мо­ду­лю не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти два числа: длину по­сле­до­ва­тель­но­сти (завершающий 0 не учитывается) и ко­ли­че­ство нечётных чисел, крат­ных 3.
Sample Input:

4
6
15
180
0
Sample Output:

4
1
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=0,res=0;
        Scanner s=new Scanner(System.in);
            while(s.hasNextInt())
            {
                
                int ch=s.nextInt();
                if (ch!=0) n++;
                if((ch%2!=0)&&(ch%3==0))  res++;
            }
         System.out.println(n);
         System.out.println(res);
      
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти целых чисел опре­де­ля­ет их сумму и ко­ли­че­ство чётных чисел, крат­ных 5. Про­грам­ма получает на вход целые числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся числом 0 (0 — при­знак окончания ввода, не вхо­дит в последовательность). Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа по мо­ду­лю не пре­вы­ша­ют 30 000. Про­грам­ма должна вы­ве­сти два числа: сумму по­сле­до­ва­тель­но­сти и ко­ли­че­ство чётных чисел, крат­ных 5
Sample Input:

4
60
15
0
Sample Output:

79
1
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int s=0,res=0;
        Scanner in=new Scanner(System.in);
            while(in.hasNextInt())
            {
                
                int ch=in.nextInt();
                if (ch!=0) {s+=ch;
                if((ch%2==0)&&(ch%5==0))  res++;}
            }
         System.out.println(s);
         System.out.println(res);
      
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти целых чисел опре­де­ля­ет их ко­ли­че­ство и сумму чётных чисел. Про­грам­ма по­лу­ча­ет на вход целые числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся числом 0 (0 — признак окон­ча­ния ввода, не вхо­дит в последовательность).

Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа по мо­ду­лю не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти два числа: длину по­сле­до­ва­тель­но­сти и сумму чётных чисел.

Sample Input:

4
60
15
0
Sample Output:

3
64
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int k=0,res=0;
        Scanner in=new Scanner(System.in);
            while(in.hasNextInt())
            {
                
                int ch=in.nextInt();
                if (ch!=0) {k++;
                if (ch%2==0)  res+=ch;}
            }
         System.out.println(k);
         System.out.println(res);
      
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти целых чисел опре­де­ля­ет их сумму и под­счи­ты­ва­ет раз­ность ко­ли­че­ства по­ло­жи­тель­ных и от­ри­ца­тель­ных чисел последовательности. Про­грам­ма по­лу­ча­ет на вход целые числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся чис­лом 0 (0 — при­знак окон­ча­ния ввода, не вхо­дит в последовательность).

Количество чисел не пре­вы­ша­ет 1000. Введённые числа по мо­ду­лю не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти два числа: сумму чисел и раз­ность ко­ли­че­ства по­ло­жи­тель­ных и от­ри­ца­тель­ных чисел.

Sample Input:

150
−200
−1
0
Sample Output:

−51
−1
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int sum=0,possitive=0,negative=0, some=0; 
        String sumres, someres;
        Scanner in=new Scanner(System.in); 
            while(in.hasNext())
            {
                String str=in.next();
                if (str.startsWith("−")) str=str.replace("−","-");  
                int ch=Integer.parseInt(str);
                if (ch!=0)
                {
                    sum+=ch;
                    if (ch>0) possitive++;
                    else negative++;
                }
            }
        
         if (sum>=0) sumres=String.valueOf(sum);
         else sumres="−"+(-sum);
         some=(possitive-negative);
         if (some>=0) someres=String.valueOf(some);
         else someres="−"+(-some);
         System.out.println(sumres);
         System.out.println(someres);
      
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти целых чисел опре­де­ля­ет их ко­ли­че­ство и под­счи­ты­ва­ет сумму по­ло­жи­тель­ных чётных чисел, не пре­вос­хо­дя­щих 256. Про­грам­ма по­лу­ча­ет на вход целые числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся чис­лом 0 (0 — при­знак окон­ча­ния ввода, не вхо­дит в последовательность).

Количество чисел не пре­вы­ша­ет 1000. Введённые числа по мо­ду­лю не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти два числа: длину по­сле­до­ва­тель­но­сти и сумму по­ло­жи­тель­ных чётных чисел, не пре­вос­хо­дя­щих 256.

Sample Input:

-20
6
1000
100
-200
0
Sample Output:

5
106
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int sum=0, count=0; 
        Scanner in=new Scanner(System.in); 
            while(in.hasNextInt())
            {
                String str=in.next();
                if (str.startsWith("−")) str=str.replace("−","-");  
                int ch=Integer.parseInt(str);
                if (ch!=0)
                {
                    count++;
                    if ((ch>0)&&(ch<256)&&(ch%2==0)) sum+=ch; 
                }
            }

         System.out.println(count);
         System.out.println(sum);
         
      
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти натуральных чисел опре­де­ля­ет количество всех чётных чисел, крат­ных 5. Про­грам­ма получает на вход на­ту­раль­ные числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся числом 0 (0 — при­знак окончания ввода, не вхо­дит в последовательность). Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма должна вы­ве­сти одно число: ко­ли­че­ство всех чётных чисел, крат­ных 5.
Sample Input:

10
14
50
25
17
0
Sample Output:

2
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int sum=0, count=0; 
        Scanner in=new Scanner(System.in); 
            while(in.hasNextInt())
            {
                String str=in.next();
                if (str.startsWith("−")) str=str.replace("−","-");  
                int ch=Integer.parseInt(str);
                if (ch!=0)
                {
                    
                    if ((ch%2==0)&&(ch%5==0)) count++; 
                }
            }
         System.out.println(count);
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет ко­ли­че­ство всех чётных чисел, крат­ных 9. Про­грам­ма по­лу­ча­ет на вход на­ту­раль­ные числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся чис­лом 0 (0 — при­знак окон­ча­ния ввода, не вхо­дит в последовательность). Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма долж­на вы­ве­сти одно число: ко­ли­че­ство всех чётных чисел, крат­ных 9.
Sample Input:

27
24
18
22
36
0
Sample Output:

2
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int sum=0, count=0; 
        Scanner in=new Scanner(System.in); 
            while(in.hasNextInt())
            {
                String str=in.next();
                if (str.startsWith("−")) str=str.replace("−","-");  
                int ch=Integer.parseInt(str);
                if (ch!=0)
                {
                    
                    if ((ch%2==0)&&(ch%9==0)) count++; 
                }
            }
         System.out.println(count);
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти натуральных чисел опре­де­ля­ет сумму всех чисел, крат­ных 7 и окан­чи­ва­ю­щих­ся на 2. Про­грам­ма получает на вход на­ту­раль­ные числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся числом 0 (0 — при­знак окончания ввода, не вхо­дит в последовательность). Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма должна вы­ве­сти одно число: сумму всех чисел, крат­ных 7 и окан­чи­ва­ю­щих­ся на 2.

Sample Input:

112
24
42
49
22
0
Sample Output:

154
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int sum=0; 
        Scanner in=new Scanner(System.in); 
            while(in.hasNextInt())
            {
                String str=in.next();
                if (str.startsWith("−")) str=str.replace("−","-");  
                int ch=Integer.parseInt(str);
                if (ch!=0)
                {
                    
                    if ((ch%7==0)&&(ch%10==2)) sum+=ch; 
                }
            }
         System.out.println(sum);
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти натуральных чисел опре­де­ля­ет сумму всех чисел, крат­ных 6 и окан­чи­ва­ю­щих­ся на 4. Про­грам­ма получает на вход на­ту­раль­ные числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся числом 0 (0 — признак окон­ча­ния ввода, не вхо­дит в последовательность). Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30 000. Про­грам­ма должна вы­ве­сти одно число: сумму всех чисел, крат­ных 6 и окан­чи­ва­ю­щих­ся на 4.
Sample Input:

24
6
34
22
84
0
Sample Output:

108
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int sum=0; 
        Scanner in=new Scanner(System.in); 
            while(in.hasNextInt())
            {
                String str=in.next();
                if (str.startsWith("−")) str=str.replace("−","-");  
                int ch=Integer.parseInt(str);
                if (ch!=0)
                {
                    
                    if ((ch%6==0)&&(ch%10==4)) sum+=ch; 
                }
            }
         System.out.println(sum);
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти натуральных чисел опре­де­ля­ет сумму всех чисел, крат­ных 8 и окан­чи­ва­ю­щих­ся на 6. Про­грам­ма получает на вход на­ту­раль­ные числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся числом 0 (0 — признак окон­ча­ния ввода, не вхо­дит в последовательность). Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30000. Про­грам­ма должна вы­ве­сти одно число: сумму всех на­ту­раль­ных чисел, крат­ных 8 и окан­чи­ва­ю­щих­ся на 6.
Sample Input:

16
24
56
22
12
0
Sample Output:

72
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int sum=0; 
        Scanner in=new Scanner(System.in); 
            while(in.hasNextInt())
            {
                String str=in.next();
                if (str.startsWith("−")) str=str.replace("−","-");  
                int ch=Integer.parseInt(str);
                if (ch!=0)
                {
                    
                    if ((ch%8==0)&&(ch%10==6)) sum+=ch; 
                }
            }
         System.out.println(sum);
    }
}
/*
Напишите программу, ко­то­рая в по­сле­до­ва­тель­но­сти натуральных чисел опре­де­ля­ет сумму всех чисел, крат­ных 3 и окан­чи­ва­ю­щих­ся на 4. Про­грам­ма получает на вход на­ту­раль­ные числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел за­кан­чи­ва­ет­ся числом 0 (0 — при­знак окончания ввода, не вхо­дит в последовательность). Ко­ли­че­ство чисел не пре­вы­ша­ет 1000. Введённые числа не пре­вы­ша­ют 30000. Про­грам­ма должна вы­ве­сти одно число: сумму всех на­ту­раль­ных чисел, крат­ных 3 и окан­чи­ва­ю­щих­ся на 4.
Sample Input:

16
24
56
22
54
0
Sample Output:

78
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int sum=0; 
        Scanner in=new Scanner(System.in); 
            while(in.hasNextInt())
            {
                String str=in.next();
                if (str.startsWith("−")) str=str.replace("−","-");  
                int ch=Integer.parseInt(str);
                if (ch!=0)
                {
                    
                    if ((ch%3==0)&&(ch%10==4)) sum+=ch; 
                }
            }
         System.out.println(sum);
    }
}
/*
На­пи­ши­те программу, ко­то­рая в по­сле­до­ва­тель­но­сти на­ту­раль­ных чисел опре­де­ля­ет сумму всех чисел, крат­ных 3 и окан­чи­ва­ю­щих­ся на 8. Про­грам­ма по­лу­ча­ет на вход на­ту­раль­ные числа, ко­ли­че­ство введённых чисел неизвестно, по­сле­до­ва­тель­ность чисел заканчи- ва­ет­ся чис­лом 0 (0 — при­знак окон­ча­ния ввода, не вхо­дит в последовательность). Ко­ли­че­ство чисел не пре­вы­ша­ет 100. Введённые числа не пре­вы­ша­ют 300. Про­грам­ма долж­на вы­ве­сти одно число: сумму всех чисел, крат­ных 3 и окан­чи­ва­ю­щих­ся на 8.

Sample Input:

23
48
12
18
34
0
Sample Output:

66
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int sum=0; 
        Scanner in=new Scanner(System.in); 
            while(in.hasNextInt())
            {
                String str=in.next();
                if (str.startsWith("−")) str=str.replace("−","-");  
                int ch=Integer.parseInt(str);
                if (ch!=0)
                {
                    
                    if ((ch%3==0)&&(ch%10==8)) sum+=ch; 
                }
            }
         System.out.println(sum);
    }
}
/*

*/

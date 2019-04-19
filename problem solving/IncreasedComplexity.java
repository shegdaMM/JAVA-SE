/*
Предлагаем вам немного вспомнить школьный курс геометрии. 
На вход программе подается три вещественных числа. Числа могут быть любыми, в том числе отрицательными и равными нулю. 
Вам необходимо определить, можно ли из трех отрезков, длины которых соответствуют введенным числам составить треугольник, и какой треугольник (прямоугольный, остроугольный или тупоугольный) при этом получится.

Формат ввода
Три числа в одну строку через пробел.

Формат вывода
В ответ надо вывести целое число: 
-1, если треугольник с такими сторонами не существует, 
0, если треугольник прямоугольный, 
1, если треугольник остроугольный и 2, если треугольник тупоугольный.

Sample Input:

3
4
5
Sample Output:

0
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        String str=in.next();
        if (str.startsWith("−")) str=str.replace("−","-");  
        double a=Double.parseDouble(str);
        
        str=in.next();
        if (str.startsWith("−")) str=str.replace("−","-");  
        double b=Double.parseDouble(str);
        
        str=in.next();
        if (str.startsWith("−")) str=str.replace("−","-");  
        double c=Double.parseDouble(str);
       
        if ((a>0)&&(b>0)&&(c>0))
        {
            if ((a+b>c)&&(a+c>b)&&(c+b>a)) 
            {
                if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a))
                {       System.out.println(0);   }  //прямоугольный  если один из углов равен 90 градусов
                if((a*a+b*b>c*c)&&(a*a+c*c>b*b)&&(c*c+b*b>a*a)) 
                {        System.out.println(1); } //остроугольный если все углы треугольника острые. c2 < a2+b2
                if((a*a+b*b<c*c)||(a*a+c*c<b*b)||(c*c+b*b<a*a))
                {       System.out.println(2);  }  //тупоугольный  если один из углов больше 90 градусов;  c2 > a2+b2
            }
            else  System.out.println(-1); //не существует
        }    
        else  System.out.println(-1); //не существует
    }
}
/*
Иннокентий Петрович накопил некоторую сумму А и решил открыть счет в банке, чтобы ее преумножить. 
Банк предлагает годовой процент – В и вклад с капитализацией этого самого процента. 
Это означает, что по прошествии года на счету у Иннокентия Петрович будет уже сумма, равная А*(1 + B/100) и уже от нее на следующий год будет считаться процент. 
Иннокентий Петрович хочет узнать, сколько же лет надо ему хранить деньги в банке, чтобы накопить сумму С.

Sample Input:

100
10
120
Sample Output:

2
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        String str=in.next();
        if (str.startsWith("−")) str=str.replace("−","-");  
        double a=Double.parseDouble(str);
        
        str=in.next();
        if (str.startsWith("−")) str=str.replace("−","-");  
        double b=Double.parseDouble(str);
        
        str=in.next();
        if (str.startsWith("−")) str=str.replace("−","-");  
        double c=Double.parseDouble(str);
       
        int years=0;
        if ((a>0)&&(b>0)&&(c>0))
        {
           while(a<c)
           {
               a=a*(1+b/100);
               years++;
           }
           System.out.println(years);
        }    
        
    }
}
/*
В шахматах конь ходит буквой “Г” — на одну клетку по горизонтали в любую сторону и на две клетки по вертикали, или наоборот. Даны две различные клетки шахматной доски, определите, может ли конь за один ход прыгнуть с первой клетки на вторую.

Формат ввода
В первой строке вводится номер столбца 1 первой клетки, затем на следующей строке номер строки первой клетки. Потом аналогично на третьей и четвертой строках вводятся данных о второй клетке.

Формат вывода
Программа должна вывести YES, если из первой клетки конь за один ход может попасть во вторую или NO в противном случае.

Sample Input:

2
3
1
1
Sample Output:

YES
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int ar=in.nextInt(); //row 1
        int ac=in.nextInt(); //col 1
        int br=in.nextInt(); //row 2
        int bc=in.nextInt(); //col 1
        /*
          1   2   3   4
     1  |_2_|___|___|___|    1 ход по горизонтали + 2 хода по вертикали
     2  |___|___|___|___|    __________________________________________  
     3  |___|_1_|___|___|                      ИЛИ
     4  |___|___|___|___|    __________________________________________
     5  |___|___|___|___|    1 ход по вертикали + 2 хода по горизонтали
        */
        if ((ar>0)&&(ac>0)&&(br>0)&&(bc>0)) //only > 0
        {
           int dr=Math.abs(ar-br); //ростояние по стобцам
           int dc=Math.abs(ac-bc); //ростояние по строкам
           if (((dr==1)&&(dc==2))||((dr==2)&&(dc==1)))
                System.out.println("YES");
           else 
                System.out.println("NO");
        }    
        
    }
}
/*
Назовем последовательность А из n-элементов красивой, если для всех 2 ≤ i ≤ n-1 выполняется условие:  
Проверьте, является ли предложенная Вам последовательность красивой.

Формат ввода
В первой строке входных данных записано число n — количество элементов последовательности (n < 30).
На второй строке входных данных ряд целых чисел, вводимых через пробел.

Формат вывода
YES – если последовательность красивая.
NO – если последовательность не является красивой.

Sample Input:

3
1
2
3
Sample Output:

YES
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt(); 
        int itIs=1;
        while(in.hasNextInt())
        {
            int ch=in.nextInt();
            if ((ch<=(n-1))&&(ch<=2)) itIs++;
            
        }    
           if (itIs==n)
                System.out.println("YES");
           else 
                System.out.println("NO");
           
       // "YES"
    }
}
/*
Создайте программу конвертер валют. Сначала указываеться тип валюты 1-рубли, 2-доллары, 3-евро, далее указываеться количество денежных средств, коротые необходимо конвертировать, далее указываеться валюта в которую необходимо перевести. Курсы к рублю валют: 1 евро - 74 , 1 доллар - 65

Sample Input:

2
120
1
Sample Output:

7800
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int a=in.nextInt(); 
        double w=in.nextDouble(); 
        int b=in.nextInt(); 
        double res=0;
        double dtoru=65.0;
        double etoru=74.1;
        if((w>0)&&(a>=1)&&(a<=3)&&(b>=1)&&(b<=3)){
        
            if ((a==1)&&(b==2)) {res=w/dtoru;}
            if ((a==1)&&(b==3)) {res=w/etoru;}
            if ((a==2)&&(b==1)) {res=w*dtoru;}
            if ((a==2)&&(b==3)) {res=w*(dtoru/etoru);}
            if ((a==3)&&(b==1)) {res=w*etoru;}
            if ((a==3)&&(b==2)) {res=w*(etoru/dtoru);}
            if (a==b) {res=(double)w;}
            
            System.out.println(Math.round(res));
        }
        else System.out.println(0);
    }
}
/*
Программа для рассчета остатка энергии робота. Указаваться сколько в процентах потратил энергии робот, необходимо указать сколько заряда осталось. Вводиться вещественное число.

Sample Input:

70
Sample Output:

30
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        double a=in.nextDouble();
        if(a>0)
        {
        double b=100.0-a;
        if(b%1>0)
        System.out.println(b);
        else System.out.println((int)b);
        }
        else System.out.println(100);
        
    }
}
/*
Программа делитель. Программа получает на вход два числа, должна вывести результат деления первого на второе. В случае ошибки выводиться надпись "Error" 

Sample Input:

12
3
Sample Output:

4.0
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        double a=in.nextDouble();
        double b=in.nextDouble();
        if((a!=0)&&(b!=0))
        {
        double d=a/b;
        System.out.println(d);
        }
        else System.out.println("Error");
    }
}
/*
Программа рассчитывающая количество N-буквенных слов. Сначала вводиться N - количество букв в слове, потом количество букв из которых будет составлено это слово.

Sample Input:

1
5
Sample Output:

5
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt();
        int b=in.nextInt();
        if((n>0)&&(b>0))
        {
        int k=(int)Math.pow(b,n);
        System.out.println(k);
        }
        else System.out.println(0);
        
    }
}
/*
Программа составитель чисел наоборот. Программа получает сначала количество цифр в будущем числе, затем получает каждую цифру в этом числе слево направо. Строит из введенных цифр число и переворачивает его в обратном порядке. Но для собственной проверки программа отнимает единицу из построенного числа и выводит результат на экран. Число не может начинаться с ноля, поэтому программа отбрасывает незначащие нули, если таковые имеются. Например:

ВХОДНЫЕ ДАННЫЕ:

3

1

2

3 

ВЫХОДНЫЕ ДАННЫЕ

320

3 - количество цифр в будущем числе. Далее вводятся цифры будущего числа слево направо 1,2,3. Программа строит число и переворачивает его наоборот, получая 321, осуществляя проверку отнимает единицу и выводит на экран. 320

Sample Input:

4
1
2
3
4
Sample Output:

4320
*/
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if (n>0)
        {
             int [] mas=IntStream.generate(()->in.nextInt()).limit(n).toArray();  
             StringBuilder builder = new StringBuilder();
             for(int s : mas) 
             {    builder.append(s);    }
             String str = builder.reverse().toString();
             int res=(Integer.parseInt(str))-1;
             System.out.println(res);
            
            
        }
        else
        {
            System.out.println(0);
        }    
    }
}
/*
Девочка Авдотья написала однажды на листе бумаги строчку, состоящую из больших и маленьких латинских букв, а после этого ушла играть в имаджинариум. Когда она вернулась, то обнаружила, что её брат Филипп зашифровал ее строку.

После долгих споров Дуня выяснила, что Филипп получил шифр циклическим сдвигом ее строки на несколько позиций вправо (циклический сдвиг строки abcde на 2 позиции вправо даст строку deabc).

Помогите Дуне! По строке и предполагаемому шифру узнайте минимальный возможный размер сдвига или -1, если Филипп ошибся в вычислениях.

Формат ввода
Две строки входных данных содержат строку Авдотьи и шифр Филиппа, соответственно. Строки имеют равные длины и они не пустые.

Формат вывода
Выведите ответ на вопрос задачи — целое число.

Sample Input:

a
b
Sample Output:

-1
*/
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String as=in.nextLine();
        char[] a=as.toCharArray();
        String bs=in.nextLine();
        char[] b=as.toCharArray();
        int pos=0,p=0;
        char prev=a[0];
        //if length == 1
        if (as.length()==1)
        {
           if (a[0]==bs.charAt(0)) pos=0;
           else pos=-1;
        }
        else
        {
        for(int i=1;i<as.length();i++)
        { 
           int pr=0,it=0;
           pr=bs.indexOf(prev,pr);
           if (it==as.length()-1) it=bs.indexOf(a[i],0); 
           else it=bs.indexOf(a[i],pr+1); 
           //System.out.println("pr("+pr+")="+prev+"|| it("+ it+")="+a[i]);
           //if thisIndex-prevIndex==1 or thisIndex==0 and prevIndex=length()-1
           if(((it)-(pr)==1)||((pr==as.length()-1)&&(it==0))) {pos=i-it-1; }  
           else pos=-1;
           prev=a[i];
        }
        for(int i=0;i<as.length();i++)
        { 
           if (a[i]==b[i]) p=0;
           else p=-1;
        }
        }
        System.out.println((pos==p)? pos: -1);
        
    }
    
}
/*
Для того чтобы поехать на олимпиаду по русскому языку, ученику необходимо написать N статей. Миша узнал об этом и старательно начал писать по K статей в день.  Необходимо помочь Мише узнать едет ли он на олимпиаду или нет. Если Миша едет вывести "YES", если он не может поехать вывести "NO". Миша не сможет поехать если количество статей не будет достаточно для участия. 

Сначала вводиться количество статей, затем количество дней до олимпиады, затем сколько статей в день писал Миша.

 

Sample Input:

10
3
2
3
5
Sample Output:

YES
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        long n=in.nextLong();
        long d=in.nextLong();
        long sum=LongStream.generate(()->in.nextLong()).limit(d).sum();
        if((sum>=n))
        {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
/*
Для того чтобы поехать на олимпиаду по русскому языку, ученику необходимо написать N статей. Миша узнал об этом и старательно начал писать по K статей в день.  Необходимо помочь Мише узнать едет ли он на олимпиаду или нет. Если Миша едет вывести "YES" и количество минут потраченных лишних, если количество статей оказалось больше чем необходимо для участия (если он не поратил лишнего времени количество минут выводить не нужно), если он не может поехать вывести "NO" и количество статей, которых не хватило для участия. Миша не сможет поехать если количество статей не будет достаточно для участия. Известно что в среднем на написание одной статьи у Миши уходит 21 минута.

Сначала вводиться количество статей, затем количество дней до олимпиады, затем сколько статей в день писал Миша.

Sample Input:

10
3
4
4
4
Sample Output:

YES

42
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        long n=in.nextLong();
        long d=in.nextLong();
        long sum=LongStream.generate(()->in.nextLong()).limit(d).sum();
        if(sum==n)
        {
            System.out.println("YES");
        }
        if(sum<n) 
        {
            System.out.println("NO");
            System.out.println();
            System.out.println(n-sum);
        }
        if(sum>n) 
        {
            System.out.println("YES");
            System.out.println();
            System.out.println((sum-n)*21);
        }
        
    }
}
/*
Несколько дней подряд метеоролог измеряет температуру воздуха в своём городе. Ваша программа считывает измеренные им значения и выводит среднее значение температуры за время измерений. Чтобы обозначить конец ввода данных, вводится значение, меньшее -300(реальная температура не может быть ниже -273.15).

При проведении вычислений с действительными числами ответ может незначительно отличаться от математически правильного из-за погрешностей округления; это не повлияет на проверку решения.

Sample Input:

22.5
24.5
30.5
23.5
-301
Sample Output:

25.25
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double sum=0.0; int n=0;
        while(true){
            double t=in.nextDouble();
            if(t<=(-300)) break;
            sum+=t; n++;   
        }
        double res=sum/n;
        //res=Math.round(res*100)/100;
        System.out.println(res);  
    }
}
/*
Последовательность чисел Фибоначчи описывает размножение кроликов, рост веток на деревьях и много чего ещё. Определяется последовательность так: первый и второй члены последовательности равны 1, а каждый последующий — сумме двух предыдущих. Напишите программу, которая выводит первые несколько членов последовательности Фибоначчи — все, не превышающие натурального числа, заданного пользователем.

Sample Input:

10
Sample Output:

1
1
2
3
5
8
*/
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        long n=in.nextLong();
        int a1=1; int a2=1;
        if(n>2){ System.out.println(1); System.out.println(1);   
            while(true)
            {
               int re=a1+a2;
               if(re>=n) break;
               System.out.println(re); 
               a1=a2; a2=re;
            }
        }
             
    }
}
/*
Во многих задачах, связанных с компьютерами, особенно близких к аппаратной части, важную роль играют числа, являющиеся степенями двойки: 1, 2, 4, 8 и так далее. Напишите программу, которая проверяет, является ли введённое натуральное число степенью двойки. Если да, то выводится сама эта степень; если нет, выводится «НЕТ». 

Sample Input:

302231454903657293676544
Sample Output:

78
*/
import java.util.*;
import java.math.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        String str=in.next();
        BigInteger ch=new  BigInteger(str);
        double res=log(ch);
        System.out.println((res%1==0)?(int)res:"НЕТ");
  
    }
  
public static double log(BigInteger val)
{
    // Get the minimum number of bits necessary to hold this value.
    int n = val.bitLength();

    // Calculate the double-precision fraction of this number; as if the
    // binary point was left of the most significant '1' bit.
    // (Get the most significant 53 bits and divide by 2^53)
    long mask = 1L << 52; // mantissa is 53 bits (including hidden bit)
    long mantissa = 0;
    int j = 0;
    for (int i = 1; i < 54; i++)
    {
        j = n - i;
        if (j < 0) break;

        if (val.testBit(j)) mantissa |= mask;
        mask >>>= 1;
    }
    // Round up if next bit is 1.
    if (j > 0 && val.testBit(j - 1)) mantissa++;

    double f = mantissa / (double)(1L << 52);

    // Add the logarithm to the number of bits, and subtract 1 because the
    // number of bits is always higher than necessary for a number
    // (ie. log2(val)<n for every val).
    return (n - 1 + Math.log(f) * 1.44269504088896340735992468100189213742664595415298D);
    // Magic number converts from base e to base 2 before adding. For other
    // bases, correct the result, NOT this number!
}
}
/*
Напишите программу для самоконтроля навыков устного счёта: пользователь вводит 6 целых чисел, после чего программа должна вывести их произведение. Чтобы перемножать числа было не слишком легко, нули не учитывайте. Гарантируется, что не все введённые числа — нули.

Sample Input:

3
1
-2
0
0
-2
Sample Output:

12
*/
import java.util.*;
import java.math.*;
import java.util.stream.*;
class Main {
    static long pow=1l;
    public static void multy(long x){ pow=pow*x; }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        long k=LongStream.generate(()->in.nextLong()).limit(6).filter((a)->a!=0).peek(Main::multy).count();
        System.out.println(pow);
        
    }
}
/*
Как известно, абсолютное большинство людей считают себя умнее среднего.

Измерим IQ нескольких человек. Для каждого из них рассчитаем, действительно ли его IQ превышает средний IQ по имеющимся на момент его опроса данным.

IQ (коэффициент интеллекта), определяющийся по специальным тестам — не универсальная мера интеллекта, но мы для простоты воспользуемся именно ею.

Sample Input:

4
100
101
80
99
Sample Output:

0
>
<
>
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sr=100;
        while(in.hasNextInt())
        {
            int iq=in.nextInt();
            if(iq==100) System.out.println('0');
            if(iq>100) System.out.println('>');
            if(iq<100) System.out.println('<');
        }
    }
}
/*
Составить программу нахождения среднего арифметического всех целых чисел от a до b.

Sample Input:

4
6
Sample Output:

5.0
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int start=in.nextInt();
        int end=in.nextInt();
        int sum=0; 
        start++;
        int n=end-start;
        
        for(int i=start; i<end;i++) {sum+=i; }
        double sred=sum/(n*1.0);
        
        System.out.print(sred);
    }
}
/*
Задайте список, содержащий все натуральные четные числа, меньшие 100.

Sample Input:

Sample Output:

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99
*/
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        long count=IntStream.iterate(1,(a)->a+1).limit(99).peek((a)->System.out.print(a+" ")).count();
    }
}
/*
Известны оценки по информатике каждого студента группы (оценки вводятся c клавиатуры). Определить количество пятёрок, четвёрок, троек и двоек. Сначала вводятся количество студентов, затем их оценки

Sample Input:

5
2
2
3
3
5
Sample Output:

Оценки:
пятёрок - 1
четвёрок - 0
троек - 2
двоек - 2
*/
import java.util.stream.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        long d=in.nextLong();
        long[] arr=LongStream.generate(()->in.nextLong()).limit(d).toArray();
        int n5=0,n4=0,n3=0,n2=0;
        for(long o:arr)
        {
            if(o==5) n5++;
            if(o==4) n4++;
            if(o==3) n3++;
            if(o==2) n2++;
        }
        System.out.println("Оценки:");
        System.out.println("пятёрок - "+n5+
                           "\nчетвёрок - "+n4+
                           "\nтроек - "+n3+
                           "\nдвоек - "+n2);
    }
}
/*

*/

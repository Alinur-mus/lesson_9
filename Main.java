import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/* Problem 1
Ойын картарларына олардың дәрежелері бойынша реттік номер берілген: “валет” – 11, “дама” – 12,
“король” – 13, “туз” – 14. Қалған карта номерлеры дарежелеріне сай (алты – 6 , жеті – 7 және т.б.).
Картаның номері арқылы k (6<=k<=14) оның дәрежесін анықтау.
 */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write a cart");
//        String cart = scanner.nextLine();
//        switch (cart){
//            case "6":
//                System.out.println(6);
//                break;
//            case "7":
//                System.out.println(7);
//                break;
//            case "8":
//                System.out.println(8);
//                break;
//            case "9":
//                System.out.println(9);
//                break;
//            case "10":
//                System.out.println(10);
//                break;
//            case "Valet":
//                System.out.println(11);
//                break;
//            case "Dama":
//                System.out.println(12);
//                break;
//            case "King":
//                System.out.println(13);
//                break;
//            case "Tuz":
//                System.out.println(14);
//                break;
//            default:
//                System.out.println("Eror cart");
//                break;
//        }
/* Problem 2
1 кг кәмпиттің, печеньенің, алманың бағасы белгілі. егер х кг кәмпит, у кг печенье, және z кг алма алынса, толық сатып алынған тауар құнын есептеу.
 */
//        Scanner x = new Scanner(System.in);
//        System.out.println("Write a candy weight");
//        double candy_weight = x.nextDouble();
//        Scanner y = new Scanner(System.in);
//        System.out.println("Write a cake weight");
//        double cake_weight = y.nextDouble();
//        Scanner z= new Scanner(System.in);
//        System.out.println("Write a apple weight");
//        double apple_weight = z.nextDouble();
//        int candy_price =260;
//        int cake_price =654;
//        int apple_price=190;
//        System.out.println("Сумма конфеты: "+(candy_price*candy_weight)+"\n"+"Сумма печенья: "+(cake_price*cake_weight)+"\n"+"Сумма яблок: "+(apple_price*apple_weight));
/*Problem 3
Монитор, системдық блок, клавиатура, және мышканың бағасы белгілі. Осы элементтерден құралған 5 компьютер құны қандай? N компьютер ше?
 */
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Write computer quantity");
//        int comp_quantity=scanner.nextInt();
//        int monitor_price=364;
//        int system_blok_price =354;
//        int keyboard_price =684;
//        int mouse_price = 985;
//        System.out.println("Цена на компьютер "+(monitor_price+system_blok_price+mouse_price+keyboard_price));
//        System.out.println("Цена за "+comp_quantity+" компьютеров: "+((monitor_price+system_blok_price+keyboard_price+mouse_price)*comp_quantity));
/*Problem 4
Таняның жасы - x, Митидың жасы - y. Олардың орта жасын табу, және әр қайсысының орта жасынан айырмашылығын табу қажет.
 */
//        Scanner scanner1=new Scanner(System.in);
//        System.out.println("Возраст Тани:");
//        int x = scanner1.nextInt();
//        Scanner scanner2 =new Scanner(System.in);
//        System.out.println("Возраст Мити:");
//        int y = scanner2.nextInt();
//        int orta_jas = (x+y)/2;
//        int raznost = Math.abs(x-y);
//        System.out.println("Их средний возрост равен:"+orta_jas+"\n"+"Разница их возроста равна:"+raznost);
        /*Problem 5
Үш таңбалы сан берілген. Табу қажет:
а) Ең үлкен санын;
б) Ең кіші санын;
         */
//        Scanner scanner3=new Scanner(System.in);
//        System.out.println("Введите трёх значное число:");
//        int ush_tanbali= scanner3.nextInt();
//        int san_1=ush_tanbali/100;
//        int san_2=ush_tanbali%100/10;
//        int san_3=ush_tanbali%10;
//        System.out.println("Самая маленькая цифра:" +Math.min(Math.min(san_1, san_3), Math.min(san_1,san_2)));
//        System.out.println("Самая большая цифра:"+Math.max(Math.max(san_1, san_3), Math.max(san_1,san_2)));
        /*Problem 6
        Төрт таңбалы сан берілген. Табу қажет:
а) Ең үлкен санын;
б) Ең кіші санын;
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите четырех значное число:");
        int chetireh_znachnoe= scanner.nextInt();
        int san_1 =chetireh_znachnoe/1000;
        int san_2 =chetireh_znachnoe%1000/100;
        int san_3= chetireh_znachnoe%100/10;
        int san_4= chetireh_znachnoe%10;
        System.out.println("Самая маленькая цифра:" +Math.min(Math.min(Math.min(san_1, san_2), Math.min(san_3, san_4)), Math.min(Math.min(san_1, san_4), Math.min(san_2, san_3))));
        System.out.println("Самая большая цифра:"+Math.max(Math.max(Math.max(san_1, san_2), Math.max(san_3, san_4)), Math.max(Math.max(san_1, san_4), Math.max(san_2, san_3))));
        /*Problem 7
        Егер бірінші сан, екінші саннан абсолютті шамада үлкен болса, бірінші санды 2 есе азайтатын программа құрастыру.
         */
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Введите число:");
        int san=scanner1.nextInt();
        int module_san= Math.abs(san);
        if (san>module_san){
            System.out.println(san/2);
        }else{
            System.out.println(san);
        }
        /*Problem 8
Екі сан берілген. Егер түбір астындағы екінші сан бірінші саннан кіші болса, екінші санды 5 есе көбейту.
         */
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a =scanner2.nextInt();
        Scanner scanner3=new Scanner(System.in);
        System.out.println("Введите второе число:");
        int b =scanner3.nextInt();
        if(a>Math.sqrt(b)){
            System.out.println(b*5);
        }else{
            System.out.println(a);
        }
        /* Problem 9
Үш бүтін сан берілген. Арасынан тек жұп сандарды табу қажет
         */
        int first_number=1;
        int second_number=4;
        int third_numder=6;
        if(first_number%2==0){
            System.out.println(first_number);
        }if (second_number%2==0){
            System.out.println(second_number);
        }if(third_numder%2==0){
            System.out.println(third_numder);
        }
    }
}
//概要
//伝票の商品をレジ画面から選択し、サイズや数量を打ち込む。
//すべての商品の打ち込みが完了したら、割引チケットの有無を確認し、チケットがある場合は、割引金額を合計金額から値引きする。
//最後に、消費税を加えた合計金額をお客さまに提示する。
//お客さまから代金を預かり、預かり金額をレジに入力すると、釣り銭が表示され、釣り銭をお客さまに返金する。

package itecafe;

import static java.lang.Math.ceil;
import java.util.Scanner;

/**
 *
 * @author kbc19a32
 */
public class ITECafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item hotcoffee = new Item(1, "ホットコーヒー", 280);
        Item tea = new Item(2, "紅茶", 260);
        Item icedcoffee = new Item(3, "アイスコーヒー", 200);
        Item icedtea = new Item(4, "アイスティー", 260);
        Item Shortcake = new Item(5, "ショートケーキ", 400);
        Item Cheesecake = new Item(6, "チーズケーキ", 400);
        Item ChocolateCake = new Item(7, "チョコレートケーキ", 450);
        Item ChocolateBananaParfait = new Item(8, "チョコバナナパフェ", 390);
        Item StrawberryParfait = new Item(9, "イチゴパフェ", 390);
        Item MeatPasta = new Item(10, "ミートパスタ", 650);
        Item MixPizza = new Item(11, "ミックスピザ", 700);
        Item Croissant = new Item(12, "クロワッサン", 180);
        Item ToastSandwich = new Item(13, "トーストサンド", 200);
        Item FrenchToast = new Item(14, "フレンチトースト", 210);
        Item out = new Item(15, "", 0);
        Item[] items = new Item[20];
        items[0] = hotcoffee;
        items[1] = tea;
        items[2] = icedcoffee;
        items[3] = icedtea;
        items[4] = Shortcake;
        items[5] = Cheesecake;
        items[6] = ChocolateCake;
        items[7] = ChocolateBananaParfait;
        items[8] = StrawberryParfait;
        items[9] = MeatPasta;
        items[10] = MixPizza;
        items[11] = Croissant;
        items[12] = ToastSandwich;
        items[13] = FrenchToast;
        items[14] = out;
        Scanner scan = new Scanner(System.in);

        Ticket a1 = new Ticket(1, 0.1);
        Ticket a2 = new Ticket(2, 0.2);
        Ticket a3 = new Ticket(3, 0.3);
        Ticket a4 = new Ticket(4, 0.4);

        int gouKin = 0;
        int goukeikin = 0;
        int inputNum; //入力された商品番号
        while (true) {
//商品名を表示する
            System.out.println("■■■■■■■■■■■■■■■■■■■ ITECafeシステム ■■■■■■■■■■■■■■■■■■■");
            System.out.print("〔ドリンク〕");
            System.out.print("　　       　〔スイーツ〕");
            System.out.print("　　　       〔軽食〕");
            System.out.println("　　       　〔パン〕");
            System.out.print(hotcoffee.getNo() + ":" + hotcoffee.getName());
            System.out.print("      " + Shortcake.getNo() + ":" + Shortcake.getName());
            System.out.print("         " + MeatPasta.getNo() + ":" + MeatPasta.getName());
            System.out.println("      " + Croissant.getNo() + ":" + Croissant.getName());
            System.out.print(tea.getNo() + ":" + tea.getName());
            System.out.print("              " + Cheesecake.getNo() + ":" + Cheesecake.getName());
            System.out.print("          " + MixPizza.getNo() + ":" + MixPizza.getName());
            System.out.println("      " + ToastSandwich.getNo() + ":" + ToastSandwich.getName());
            System.out.print(icedcoffee.getNo() + ":" + icedcoffee.getName());
            System.out.print("      " + ChocolateCake.getNo() + ":" + ChocolateCake.getName());
            System.out.println("                        " + FrenchToast.getNo() + ":" + FrenchToast.getName());
            System.out.print(icedtea.getNo() + ":" + icedtea.getName());
            System.out.println("        " + ChocolateBananaParfait.getNo() + ":" + ChocolateBananaParfait.getName());
            System.out.println("                   " + StrawberryParfait.getNo() + ":" + StrawberryParfait.getName());
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
//商品番号を入力する
            System.out.print("商品番号を入力してください:");
                String inputStr;
                inputStr = scan.next();
                inputNum = Integer.parseInt(inputStr);
                System.out.println(inputNum);
                System.out.println(items[inputNum - 1].getNo() + ":" + items[inputNum - 1].getName()
                        + " " + items[inputNum - 1].getPrice() + "円");
                System.out.print("個数を入力してください:");
                int kosu = new java.util.Scanner(System.in).nextInt();
                int goke = items[inputNum - 1].getPrice() * kosu;
                System.out.println("合計金額　" + goke + "円");
                goukeikin += items[inputNum - 1].getPrice() * kosu;

                System.out.println("ご注文なら1、お会計なら0を入力してください");
                int ye = new java.util.Scanner(System.in).nextInt();

                    while (ye == 1) {
                        System.out.print("商品番号を入力してください:");
                        inputStr = scan.next();
                        inputNum = Integer.parseInt(inputStr);
                        System.out.println(inputNum);
                        System.out.println(items[inputNum - 1].getNo() + ":" + items[inputNum - 1].getName()
                                + " " + items[inputNum - 1].getPrice() + "円");

                        System.out.print("個数を入力してください:");
                        int kosu1 = new java.util.Scanner(System.in).nextInt();
                        int goke1 = items[inputNum - 1].getPrice() * kosu1;
                        System.out.println("合計金額　" + goke1 + "円");
                        goukeikin += items[inputNum - 1].getPrice() * kosu1;
                        System.out.println("注文全体の合計金額　" + goukeikin + "円");
                        if (items[inputNum - 1].getNo() == 15) {
                            break;
                        }
                    }
                    System.out.println("割引券があるなら割引額に応じて１から４、なければ０を入力してください");
                    int wari = new java.util.Scanner(System.in).nextInt();
                    if (wari >= 1) {

                        switch (wari) {
                            case 1:
                                System.out.print("割引後の金額は");
                                System.out.println(ceil(goukeikin - goukeikin * a1.getDiscount()) + "円(税込)");
                                gouKin = (int) ceil(goukeikin - goukeikin * a1.getDiscount());
                                break;
                            case 2:
                                System.out.print("割引後の金額は");
                                System.out.println(ceil(goukeikin - goukeikin * a2.getDiscount()) + "円(税込)");
                                gouKin = (int) ceil(goukeikin - goukeikin * a2.getDiscount());
                                break;
                            case 3:
                                System.out.print("割引後の金額は");
                                System.out.println(ceil(goukeikin - goukeikin * a3.getDiscount()) + "円(税込)");
                                gouKin = (int) ceil(goukeikin - goukeikin * a3.getDiscount());
                                break;
                            case 4:
                                System.out.print("割引後の金額は");
                                System.out.println(ceil(goukeikin - goukeikin * a4.getDiscount()) + "円(税込)");
                                gouKin = (int) ceil(goukeikin - goukeikin * a4.getDiscount());
                                break;
                        }

//正しく処理されたらループを抜ける｝
                    } else if (wari == 0) {
                        System.out.println("合計金額" + goukeikin + "円(税込)");
                        gouKin = goukeikin;
                    }

                    System.out.println("-------------------------------");
                    System.out.println("小計  " + goukeikin + "円");
                    System.out.println("内消費税等  " + (int) goukeikin * 0.08 + "円");
                    System.out.println("合計金額  " + goukeikin * 108 / 100 + "円");
                    int goukeikin1 = goukeikin * 108 / 100;

                    System.out.println("預かり金額を入力してください:");
                    String azukariKin = scan.next();
                    int turiKin = Integer.parseInt(azukariKin) - goukeikin1;
                    System.out.println("釣銭：" + turiKin + "円");
                    break;

                }
            }

        }
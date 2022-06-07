# 課題 13-3: ハッシュマップ

### 課題の説明
次のRailwayLineクラスは、各駅名をキーとし、その駅の1日あたりの利用者数を値にしたHashMapを山手線のデータで
初期化した変数stationsをもつ。
RailwayLineクラスに1日あたりの利用者数の合計と平均を求めるメソッドgetSum()とgetMean()を追加しなさい。


| メソッド名   | 引数のリスト | 戻り値の型  | 
|---------|--------|--------|
| getSum  | なし     | int    | 
| getMean | なし     | double | 

### RailwayLine.java
```java
import java.util.HashMap;
import java.util.Map;

public class RailwayLine {
    Map<String, Integer> stations = new HashMap<String, Integer>() {
        {
            put("東京", 934330);
            put("神田", 212182);
            put("秋葉原", 504534);
            put("御徒町", 141074);
            put("上野", 376340);
            put("鶯谷", 52296);
            put("日暮里", 230184);
            put("西日暮里", 201880);
            put("田端", 94880);
            put("駒込", 99082);
            put("巣鴨", 154398);
            put("大塚", 117852);
            put("池袋", 1133988);
            put("目白", 76380);
            put("高田馬場", 423374);
            put("新大久保", 102876);
            put("新宿", 1578732);
            put("代々木", 140958);
            put("原宿", 150682);
            put("渋谷", 741712);
            put("恵比寿", 295398);
            put("目黒", 231120);
            put("五反田", 282702);
            put("大崎", 346272);
            put("品川", 766884);
            // put("高輪ゲートウェイ", );
            put("田町", 312728);
            put("浜松町", 324286);
            put("新橋", 563942);
            put("有楽町", 346006);
        }
    };
}
```


### ProgD3.java (提出不要)
```java
public class ProgD3 {

    public static void main(String[] args) {
        RailwayLine yamanote = new RailwayLine();

        System.out.println(yamanote.getSum());
        System.out.println(yamanote.getMean());
    }

}
```
### 実行結果
```
10937072
377140.0
```
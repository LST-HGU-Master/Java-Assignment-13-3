import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
/**
 * @version (20220714)
 *  注意）このテストコードは RailwayLineクラスに２つのメソッドが定義されるまでエラーとなる
 */
public class RailwayLineTest {

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

    @Test
    public void testSum()
    {
        // action
        RailwayLine y = new RailwayLine();
        // assertion
        assertEquals(10937072, y.getSum(),"利用者の合計値が不正です!");

        // action
        y.stations.put("高輪ゲートウェイ", 30);
        // assertion 2
        assertEquals(10937102, y.getSum(),"利用者の合計値計算が正しく行われていません!");
    }

    @Test
    public void testMean()
    {
        // action
        RailwayLine y = new RailwayLine();
        // assertion
        assertEquals(377140, y.getMean(),"利用者の平均値が不正です!");
        
        // action
        y.stations.put("高輪ゲートウェイ", 30);
        // assertion 2
        assertEquals(364570, y.getMean(),"利用者の平均値計算が正しく行われていません!");
    }
}

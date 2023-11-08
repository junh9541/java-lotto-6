package lotto.domain;

import java.util.ArrayList;
import java.util.List;
import lotto.util.RandomGenerator;

public class Lottos {
    private List<Lotto> lottos = new ArrayList<>();
    private int amount=0;

    public Lottos(int amount){
        this.amount=amount;
        for (int i = 0; i < amount; i++) {
            List<Integer> LottoNumber = RandomGenerator.generateRandomNums();
            lottos.add(new Lotto(LottoNumber));
        }

    }

    public int getAmount(){
        return amount;
    }

    public String getLottoStrings(){
        String totalLottoStrings = "";
        for (int i = 0; i < amount; i++) {
            String LottoString = lottos.get(i).getLottoString();
            totalLottoStrings=totalLottoStrings+LottoString+"\n";
        }
        return totalLottoStrings;
    }

}

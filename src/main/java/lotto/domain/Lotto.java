package lotto.domain;

import java.util.*;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        duplicateNumbers(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현

    public List<Integer> getLottoNumbers() {
        return numbers;
    }

    public void duplicateNumbers(List<Integer> list){
        Set<Integer> set = new HashSet<>();
        for(int num : list){
            set.add(num);
        }

        if(list.size()!=set.size()){
            throw new IllegalArgumentException("[ERROR]");
        }
    }
}
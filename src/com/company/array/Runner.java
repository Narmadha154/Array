package com.company.array;

import java.util.Scanner;

public class Runner{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the program number:");
        int number=sc.nextInt();
        switch(number) {
            case 1:
                Rotate rot = new Rotate();
                rot.rotateLeft();
                break;
            case 2:
                SmallerCount small= new SmallerCount();
                small.countSmaller();
                break;
            case 3:
                SubArrSum sum= new SubArrSum();
                sum.subArr();
                break;
            case 4:
                 WaveArray wave = new WaveArray();
                 wave.sortWaveForm();
                 break;
            case 5:
                AlternateSort sort= new AlternateSort();
                sort.sortAlternateForm();
                break;
            case 6:
                MajorityElement maj= new MajorityElement();
                maj.majEle();
                break;
            case 7:
                FreqBasedSort freq= new FreqBasedSort();
                freq.sortFreqBased();
                break;
            case 8:
                Index index = new Index();
                index.findIndex();
                break;
            case 9:
                BalancedArray bal = new BalancedArray();
                long balance= bal.balArr();
                System.out.println(balance);
                break;
            case 10:
                ShuffleArray shuffleArr= new ShuffleArray();
                shuffleArr.shuffle();
                break;
            case 11:
                Pair pairCount= new Pair();
                pairCount.sumPairs();
                break;
            case 12:
                GoodPair goodPairCount= new GoodPair();
                goodPairCount.findGoodPairs();
                break;
            case 13:
                MinDifference diff= new MinDifference();
                diff.minDiff();
                break;
            case 14:
                Leader lead= new Leader();
                lead.findLeader();
                break;
            case 15:
                MinDistance dis= new MinDistance();
                dis.findMinDis();
                break;
            default:
                System.out.println("no program");
        }
    }
}

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
            case 16:
                RearrangeArray arrange= new RearrangeArray();
                arrange.rearrangeArr();
                break;
            case 17:
                SubArr sub= new SubArr();
                sub.subArr();
                break;
            case 18:
                NonRepeat rep= new NonRepeat();
                rep.findFirstNonRepeat();
                break;
            case 19:
                MinElement min= new MinElement();
                min.findMinEle();
                break;
            case 20:
                KthSmallest smallEle= new KthSmallest();
                smallEle.findKthSmallestElement();
                break;
            case 21:
                CelebrityProblem cele =new CelebrityProblem();
                int res= cele.celebrity();
                System.out.println(res);
                break;
            case 22:
                RemoveDup rem= new RemoveDup();
                rem.remDup();
                break;
            case 23:
                KadanesAlgorithm algo= new KadanesAlgorithm();
                algo.maxSubArraySum();
                break;
            case 24:
                ExtraElementIndex ind= new ExtraElementIndex();
                int indexOfEle=ind.findIndexOfExtraElement();
                System.out.println(indexOfEle);
                break;
            case 25:
                RunLengthEncoding encode= new RunLengthEncoding();
                encode.encode();
                break;
            case 26:
                UnionArray union= new UnionArray();
                union.findUnionArrLength();
                break;
            case 27:
                KeyPair key= new KeyPair();
                boolean val=key.findKeyPair();
                System.out.println(val);
                break;
            case 29:
                PeakElement peak= new PeakElement();
                int value=peak.findPeakEle();
                System.out.println(value);
                break;
            case 30:
                JumpGame jump= new JumpGame();
                jump.findSteps();
                break;
            case 31:
                PascalsTriangle tri= new PascalsTriangle();
                tri.triangle();
                break;
            case 32:
                Search position= new Search();
                int pos=position.searchInsertPosition();
                System.out.println(pos);
                break;
            case 33:
                SlidingWindow slide= new SlidingWindow();
                slide.window();
                break;
            case 34:
                DistinctDigit digit= new DistinctDigit();
                digit.findDistinctDigit();
                break;
            case 35:
                KthSmallNthLarge smala= new KthSmallNthLarge();
                smala.findSmallLarge();
                break;
            case 36:
                Increment inc= new Increment();
                inc.incrementArr();
                break;
            case 37:
                SingleOne single= new SingleOne();
                single.findSingleOne();
                break;
            case 38:
                SevenUp up= new SevenUp();
                up.findDivisible();
                break;
            case 39:
                LocalMinima minima= new LocalMinima();
                minima.findLocalMinima();
                break;
            case 40:
                ContiguousSubAr subArr= new ContiguousSubAr();
                int [] arr=subArr.findSum();
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+"\t");
                }
                break;
            default:
                System.out.println("no program");
        }
    }
}

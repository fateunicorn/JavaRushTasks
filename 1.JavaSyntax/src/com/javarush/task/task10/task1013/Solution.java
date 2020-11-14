package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private Boolean beFuckedMother;
        private Boolean beFuckedFather;
        private Boolean beFuckedSister;
        private Boolean beFuckedBrother;
        private Short HowBeFuckedMother;
        private Short HowBeFuckedParent;

        public Human (Boolean beFuckedMother, Boolean beFuckedFather, Boolean beFuckedSister, Boolean beFuckedBrother, Short HowBeFuckedMother, Short HowBeFuckedParent){
            this.beFuckedMother=beFuckedMother;
            this.beFuckedFather=beFuckedFather;
            this.beFuckedSister=beFuckedSister;
            this.beFuckedBrother=beFuckedBrother;
            this.HowBeFuckedMother=HowBeFuckedMother;
            this.HowBeFuckedParent=HowBeFuckedParent;
        }
        public Human ( Boolean beFuckedFather, Boolean beFuckedSister, Boolean beFuckedBrother, Short HowBeFuckedMother, Boolean beFuckedMother, Short HowBeFuckedParent){
            this.beFuckedMother=beFuckedMother;
            this.beFuckedFather=beFuckedFather;
            this.beFuckedSister=beFuckedSister;
            this.beFuckedBrother=beFuckedBrother;
            this.HowBeFuckedMother=HowBeFuckedMother;
            this.HowBeFuckedParent=HowBeFuckedParent;
        }
        public Human ( Boolean beFuckedFather, Boolean beFuckedSister, Short HowBeFuckedParent, Boolean beFuckedBrother, Short HowBeFuckedMother, Boolean beFuckedMother){
            this.beFuckedMother=beFuckedMother;
            this.beFuckedFather=beFuckedFather;
            this.beFuckedSister=beFuckedSister;
            this.beFuckedBrother=beFuckedBrother;
            this.HowBeFuckedMother=HowBeFuckedMother;
            this.HowBeFuckedParent=HowBeFuckedParent;
        }
        public Human (Boolean beFuckedSister, Short HowBeFuckedParent, Boolean beFuckedBrother, Short HowBeFuckedMother, Boolean beFuckedFather, Boolean beFuckedMother){
            this.beFuckedMother=beFuckedMother;
            this.beFuckedFather=beFuckedFather;
            this.beFuckedSister=beFuckedSister;
            this.beFuckedBrother=beFuckedBrother;
            this.HowBeFuckedMother=HowBeFuckedMother;
            this.HowBeFuckedParent=HowBeFuckedParent;
        }
        public Human (Short HowBeFuckedParent, Boolean beFuckedBrother, Short HowBeFuckedMother, Boolean beFuckedFather, Boolean beFuckedSister, Boolean beFuckedMother){
            this.beFuckedMother=beFuckedMother;
            this.beFuckedFather=beFuckedFather;
            this.beFuckedSister=beFuckedSister;
            this.beFuckedBrother=beFuckedBrother;
            this.HowBeFuckedMother=HowBeFuckedMother;
            this.HowBeFuckedParent=HowBeFuckedParent;
        }
        public Human (Boolean beFuckedBrother, Short HowBeFuckedMother, Short HowBeFuckedParent, Boolean beFuckedFather, Boolean beFuckedSister, Boolean beFuckedMother){
            this.beFuckedMother=beFuckedMother;
            this.beFuckedFather=beFuckedFather;
            this.beFuckedSister=beFuckedSister;
            this.beFuckedBrother=beFuckedBrother;
            this.HowBeFuckedMother=HowBeFuckedMother;
            this.HowBeFuckedParent=HowBeFuckedParent;
        }
        public Human (Short HowBeFuckedMother, Short HowBeFuckedParent, Boolean beFuckedFather, Boolean beFuckedSister, Boolean beFuckedBrother, Boolean beFuckedMother){
            this.beFuckedMother=beFuckedMother;
            this.beFuckedFather=beFuckedFather;
            this.beFuckedSister=beFuckedSister;
            this.beFuckedBrother=beFuckedBrother;
            this.HowBeFuckedMother=HowBeFuckedMother;
            this.HowBeFuckedParent=HowBeFuckedParent;
        }
        public Human (Boolean beFuckedFather, Short HowBeFuckedMother, Boolean beFuckedSister, Boolean beFuckedBrother, Boolean beFuckedMother){
            this.beFuckedMother=beFuckedMother;
            this.beFuckedFather=beFuckedFather;
            this.beFuckedSister=beFuckedSister;
            this.beFuckedBrother=beFuckedBrother;
            this.HowBeFuckedMother=HowBeFuckedMother;
        }
        public Human (Short HowBeFuckedMother, Boolean beFuckedSister, Boolean beFuckedBrother, Boolean beFuckedMother){
            this.beFuckedMother=beFuckedMother;
            this.beFuckedSister=beFuckedSister;
            this.beFuckedBrother=beFuckedBrother;
            this.HowBeFuckedMother=HowBeFuckedMother;
        }
        public Human (Boolean beFuckedSister, Boolean beFuckedBrother, Boolean beFuckedMother){
            this.beFuckedMother=beFuckedMother;
            this.beFuckedSister=beFuckedSister;
            this.beFuckedBrother=beFuckedBrother;
        }
    }
}

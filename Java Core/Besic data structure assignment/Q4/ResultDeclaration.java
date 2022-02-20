package com.compay;
class ResultDeclaration{
    public static String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        if(subject1Marks>60) {
            if(subject2Marks>60) {
                if(subject3Marks>60) {
                    return "passed";
                }
                else
                    return "promoted";
            }
            else if(subject3Marks>60)
                return "promoted";
            else {
                return "fail";
            }
        }
        else if(subject2Marks>60) {
            if(subject3Marks>60) {
                return "promoted";
            }
            else
                return "fail";
        }
        else {
            return "fail";
        }
    }

}


package com.roostermaker;

import com.roostermaker.Scanner.IScanner;

class TestScanner implements IScanner{

    int intValue;
    String stringValue;
    Double doubleValue;
    Integer IntegerValue;
  
    public void setInt(int x){
        this.intValue = x;
    }
  
    public void setString(String x){
        this.stringValue = x;
    }

    public void setInteger(Integer x){
        this.IntegerValue = x;
    }
  
    @Override
    public int nextInt() {
        return intValue;
    }
  
    @Override
    public String nextLine() {
        return stringValue;
    }

    @Override
    public Integer nextInteger() {
        return IntegerValue;
    }
  }
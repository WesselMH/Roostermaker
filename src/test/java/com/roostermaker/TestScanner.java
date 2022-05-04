package com.roostermaker;

class TestScanner implements IScanner{

    int intValue;
    String stringValue;
    Double doubleValue;
  
    public void setInt(int x){
        this.intValue = x;
    }
  
    public void setString(String x){
        this.stringValue = x;
    }
  
    @Override
    public int nextInt() {
        return intValue;
    }
  
    @Override
    public String nextLine() {
        return stringValue;
    }
  }
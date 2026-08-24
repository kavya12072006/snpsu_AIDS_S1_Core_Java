package com.snpsu.oops.pillars.inheritance.superkey;

public interface momm {
    void cook();
}
interface dad{
    void cook();
}
class child implements momm,dad{
    @Override
    public void cook() {

    }
}




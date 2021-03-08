package com.target;

/*some comments here*/

import com.other.ChildClass;
import com.other.MidInter;

public interface ParentInter {

    int a = 0;

    MidInter midInter = null;

    void parentInterTest1(int param1);

    void parentInterTest2(int param2);

    ChildClass childClass = null;
}



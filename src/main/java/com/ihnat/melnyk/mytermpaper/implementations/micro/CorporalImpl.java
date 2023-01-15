package com.ihnat.melnyk.mytermpaper.implementations.micro;

import com.ihnat.melnyk.mytermpaper.interfaces.micro.Corporal;
import com.ihnat.melnyk.mytermpaper.util.Utility;

public class CorporalImpl extends BaseMicroObject implements Corporal {
    public CorporalImpl() {
        super(Utility.imageFromResource("fareastern_republic.png"));
    }
}

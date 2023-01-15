package com.ihnat.melnyk.mytermpaper.implementations.micro;

import com.ihnat.melnyk.mytermpaper.interfaces.micro.Colonel;
import com.ihnat.melnyk.mytermpaper.util.Utility;

public class ColonelImpl extends BaseMicroObject implements Colonel {
    public ColonelImpl() {
        super(Utility.imageFromResource("siberian_republic.png"));
    }
}

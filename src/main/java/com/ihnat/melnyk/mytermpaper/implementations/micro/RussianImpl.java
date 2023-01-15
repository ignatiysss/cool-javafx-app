package com.ihnat.melnyk.mytermpaper.implementations.micro;

import com.ihnat.melnyk.mytermpaper.interfaces.micro.Russian;
import com.ihnat.melnyk.mytermpaper.util.Utility;

public class RussianImpl extends BaseMicroObject implements Russian {
    public RussianImpl() {
        super(Utility.imageFromResource("ural_republic.png"));
    }
}

package com.ihnat.melnyk.mytermpaper.interfaces.macro;

import com.ihnat.melnyk.mytermpaper.interfaces.micro.MicroObject;

public interface MacroObject<T extends MicroObject> {
    void interact(T t);
}

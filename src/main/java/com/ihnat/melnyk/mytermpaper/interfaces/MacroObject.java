package com.ihnat.melnyk.mytermpaper.interfaces;

public interface MacroObject<T extends MicroObject> {
    void interact(T t);
}

package ua.ignatiysss.cooljavafxapp.model.macro;

import ua.ignatiysss.cooljavafxapp.model.micro.MicroObject;

public interface MacroObject<T extends MicroObject> {
    void interact(T t);
}

package com.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotationTest {
    @Test
    void reverseRotation() {
        Rotation rotation=new Rotation();
        boolean currentRotation=rotation.isClockwise();
        rotation.reverseRotation();
        boolean reversedRotation=rotation.isClockwise();
        assert (currentRotation==!reversedRotation);
    }
}
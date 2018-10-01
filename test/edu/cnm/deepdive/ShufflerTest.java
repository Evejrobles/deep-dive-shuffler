package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class ShufflerTest {

  @org.junit.jupiter.api.Test
  void shuffle() {
  }

  @org.junit.jupiter.api.Test
  void shuffle1() {
  }

  @org.junit.jupiter.api.Test
  void shuffle2() {
  }

  @org.junit.jupiter.api.Test
  void shuffle3() {
  }

  @org.junit.jupiter.api.Test
  void shuffle4() {
  }

  @org.junit.jupiter.api.Test
  void shuffle5() {
  }

  @org.junit.jupiter.api.Test
  void shuffle6() {
  }

  @org.junit.jupiter.api.Test
  void shuffle7() {
  }
  @org.junit.jupiter.api.Test
  void shuffleByte() {
    byte [] source = {1, 2, 3, 4, 9, 5, 6, 7, 8, 10};
    byte [] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source,destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);


    }
  @org.junit.jupiter.api.Test
  void shuffleChar() {
    char [] source = {1, 2, 3, 4, 9, 5, 6, 7, 8, 10};
    char [] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source,destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);


  }
  @org.junit.jupiter.api.Test
  void shuffleDouble() {
    double[] source = {1, 2, 3, 4, 9, 5, 6, 7, 8, 10};
    double[] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source,destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);


  }
  @org.junit.jupiter.api.Test
  void shuffleFloat() {
    float [] source = {1, 2, 3, 4, 9, 5, 6, 7, 8, 10};
    float [] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source,destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);


  }@org.junit.jupiter.api.Test
  void shuffleInt() {
    int [] source = {1, 2, 3, 4, 9, 5, 6, 7, 8, 10};
    int [] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source,destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);


  }
  @org.junit.jupiter.api.Test
  void shuffleLong() {
    long [] source = {1, 2, 3, 4, 9, 5, 6, 7, 8, 10};
    long [] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source,destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);


  }
  @org.junit.jupiter.api.Test
  void shuffleShort() {
    short [] source = {1, 2, 3, 4, 9, 5, 6, 7, 8, 10};
    short [] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source,destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);


  }
  @org.junit.jupiter.api.Test
  void shuffleT() {
    Integer [] source = {1, 2, 3, 4, 9, 5, 6, 7, 8, 10};
    Integer [] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source,destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);


  }
  }


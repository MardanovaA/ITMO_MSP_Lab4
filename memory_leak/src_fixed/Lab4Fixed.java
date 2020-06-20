// var. 21669
public class Lab4Fixed {
  public static void main(String[] args) {
    A a = new A();
    A b = new E();
    E c = new E();
    c.s13();
    a.s30();
    c.s22();
    c.s44();
    b.s3();
    a.s49();
    a.s31();
    b.s19();
    b.s32();
    c.s39();
    a.s12(a);
    c.s12(b);
    b.s12(c);
    c.s33();
    c.s41();
    c.s43();
    Thread t = new Thread(new Runnable() {
      public void run() {
        while(true) {
          try {
             E d = new E();
             d.s34();
             //Thread.sleep(9);
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
}
class A {
  int s45;
  int s5;
  int s23;
  int s36;
  int s4;
  long s26;
  long s24;
  long s48;
  java.io.ObjectOutputStream fileStrm;
  java.io.ObjectOutputStream sampleOut;
  java.io.ObjectOutputStream sampleOutput;
  java.io.ObjectOutputStream fileWrtr;
  int[] s20 = {-1, 3, 1, 3};
  int[] s21 = {3, -2, 3, -3, 3};
  int[] s37 = {0, 3, -2, -3, 2};
  //static java.util.Map<java.net.URL,byte[]> cache = new java.util.HashMap<>();
  static java.util.Map<String,byte[]> cache = new java.util.HashMap<String,byte[]>();
  static int s27;
  static int s38;
  static int s35;
  static int s46;
  static int s1;
  java.util.List<String> s25 = new java.util.ArrayList<>();
  java.util.List<String> s2 = new java.util.ArrayList<>();
  java.util.List<String> s17 = new java.util.ArrayList<>();
  public A() {
    s45 = 6;
    s5 = 9;
    s23 = 7;
    s36 = 8;
    s4 = 3;
    s26 = 9L;
    s24 = 2L;
    s48 = 6L;
    try {
        fileStrm = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileStrm.txt"));
        sampleOut = new java.io.ObjectOutputStream(new java.io.FileOutputStream("sampleOut.txt"));
        sampleOutput = new java.io.ObjectOutputStream(new java.io.FileOutputStream("sampleOutput.txt"));
        fileWrtr = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileWrtr.txt"));
    } catch (java.lang.Exception e) {
      // Do nothing
    }
  }
  public void init() {
    try {
      if (fileStrm == null) fileStrm = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileStrm.txt"));
      System.out.println("Thread : " + Thread.currentThread() + ", fileStrm = " + fileStrm);
    } catch(Exception e) {
      // Ignore it
    }
    try {
      if (sampleOut == null) sampleOut = new java.io.ObjectOutputStream(new java.io.FileOutputStream("sampleOut.txt"));
      System.out.println("Thread : " + Thread.currentThread() + ", sampleOut = " + sampleOut);
    } catch(Exception e) {
      // Ignore it
    }
    try {
      if (sampleOutput == null) sampleOutput = new java.io.ObjectOutputStream(new java.io.FileOutputStream("sampleOutput.txt"));
      System.out.println("Thread : " + Thread.currentThread() + ", sampleOutput = " + sampleOutput);
    } catch(Exception e) {
      // Ignore it
    }
    try {
      if (fileWrtr == null) fileWrtr = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileWrtr.txt"));
      System.out.println("Thread : " + Thread.currentThread() + ", fileWrtr = " + fileWrtr);
    } catch(Exception e) {
      // Ignore it
    }
  }
  // public byte[] getValueFromCache(String s) {
    // try {
      // java.net.URL url = new java.net.URL(s);
      // if(!cache.containsKey(url)) {
        // cache.put(url, new byte[786432]);
      // }
      // return cache.get(url);
    // } catch (Exception e) {
      // System.out.println("Error: invalid URL!");
      // return null;
    // }
  // }
  public byte[] getValueFromCache(String s) {
    try {
      //java.net.URL url = new java.net.URL(s);
      if(!cache.containsKey(s)) {
        cache.put(s, new byte[786432]);
      }
      return cache.get(s);
    } catch (Exception e) {
      System.out.println("Error: invalid URL!");
      return null;
    }
  }
  
  public void s13() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOutput) {
              sampleOutput.writeObject("метод s13 в классе A (#" + String.valueOf(i) + ")");
              ////Thread.sleep(6);
              sampleOutput.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s30() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(fileWrtr) {
              fileWrtr.writeObject("метод s30 в классе A (#" + String.valueOf(i) + ")");
              ////Thread.sleep(5);
              fileWrtr.flush();
              fileWrtr.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s22() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOut) {
              sampleOut.writeObject("метод s22 в классе A (#" + String.valueOf(i) + ")");
              //Thread.sleep(6);
              sampleOut.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s44() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOut) {
              sampleOut.writeObject("метод s44 в классе A (#" + String.valueOf(i) + ")");
              //Thread.sleep(6);
              sampleOut.flush();
              sampleOut.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s3() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(fileWrtr) {
              fileWrtr.writeObject("метод s3 в классе A (#" + String.valueOf(i) + ")");
              //Thread.sleep(5);
              fileWrtr.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s49() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(fileStrm) {
              fileStrm.writeObject("метод s49 в классе A (#" + String.valueOf(i) + ")");
              //Thread.sleep(5);
              fileStrm.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public static void s31() {
    System.out.println("метод s31 в классе A");
    System.out.println(s27);
  }
  public static void s19() {
    System.out.println("метод s19 в классе A");
    System.out.println((s27 + 4));
  }
  public static void s32() {
    System.out.println("метод s32 в классе A");
    System.out.println(s38);
  }
  public static void s39() {
    System.out.println("метод s39 в классе A");
    System.out.println((s38 + 3));
  }
  public void s12(A r) {
    r.s13();
  }
  public void s12(E r) {
    r.s30();
  }
}
class E extends A {
  public E() {
    s5 = 3;
    s36 = 2;
    s4 = 5;
    s26 = 2L;
    s24 = 4L;
  }
  public void s13() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOut) {
              sampleOut.writeObject("метод s13 в классе E (#" + String.valueOf(i) + ")");
              //Thread.sleep(5);
              sampleOut.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s22() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOutput) {
              sampleOutput.writeObject("метод s22 в классе E (#" + String.valueOf(i) + ")");
              //Thread.sleep(14);
              sampleOutput.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s3() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(fileStrm) {
              fileStrm.writeObject("метод s3 в классе E (#" + String.valueOf(i) + ")");
              //Thread.sleep(11);
              fileStrm.flush();
              fileStrm.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s49() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(fileWrtr) {
              fileWrtr.writeObject("метод s49 в классе E (#" + String.valueOf(i) + ")");
              //Thread.sleep(10);
              fileWrtr.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s33() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        while(true) {
          try {
            synchronized(cache) {
              getValueFromCache("https://www.google.com");
              //Thread.sleep(5);
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s41() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        while(true) {
          try {
            synchronized(cache) {
              getValueFromCache("https://www.google.com");
              //Thread.sleep(7);
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void s43() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        while(true) {
          try {
            synchronized(cache) {
              getValueFromCache("https://www.google.com");
              //Thread.sleep(9);
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public static void s31() {
    System.out.println("метод s31 в классе E");
    System.out.println(s27++);
  }
  public static void s19() {
    System.out.println("метод s19 в классе E");
    System.out.println(s38);
  }
  public static void s32() {
    System.out.println("метод s32 в классе E");
    System.out.println((s38 - 2));
  }
  public static void s39() {
    System.out.println("метод s39 в классе E");
    System.out.println(s38);
  }
  public void s7() {
    for(int i = 0; i < 6; i++) {
      this.s2.add(String.valueOf(System.nanoTime()));
      // System.out.println(this.s2.size());
    }
  }
  public void s14() {
    for(int i = 0; i < 7; i++) {
      this.s2.add(String.valueOf(System.nanoTime()));
      // System.out.println(this.s2.size());
    }
  }
  public void s6() {
    for(int i = 0; i < 7; i++) {
      this.s17.add(String.valueOf(System.nanoTime()));
      // System.out.println(this.s17.size());
    }
  }
  public void s34() {
    for(int i = 0; i < 7; i++) {
      this.s25.add(String.valueOf(System.nanoTime()));
      // System.out.println(this.s25.size());
    }
  }
  public void s12(A r) {
    r.s22();
  }
  public void s12(E r) {
    r.s44();
  }
}
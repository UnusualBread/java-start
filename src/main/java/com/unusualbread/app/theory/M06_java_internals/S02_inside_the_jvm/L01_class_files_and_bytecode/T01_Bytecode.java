package com.unusualbread.app.theory.M06_java_internals.S02_inside_the_jvm.L01_class_files_and_bytecode;

public class T01_Bytecode {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + b);
    }
}

/*
compile: javac T01_Bytecode.java
execution: java -cp . T01_Bytecode
disassemble: javap -c T01_Bytecode.class
see class information: javap -v T01_Bytecode.class

bytecode of this class:
Compiled from "T01_Bytecode.java"
public class T01_Bytecode {
  public T01_Bytecode();
    Code:
       0: aload_0
       1: invokespecial #1  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: iconst_1
       1: istore_1
       2: iconst_2
       3: istore_2
       4: get static     #2  // Field java/lang/System.out:Ljava/io/PrintStream;
       7: iload_1
       8: iload_2
       9: iadd
      10: invokevirtual #3  // Method java/io/PrintStream.println:(I)V
      13: return
}

information about this class:
Classfile /../../T01_Bytecode.class
  Last modified Oct 8, 2019; size 392 bytes
  MD5 checksum 7c6f013dc34260456bdde418433a1029
  Compiled from "T01_Bytecode.java"
public class T01_Bytecode
  minor version: 0
  major version: 55
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #4                    // T01_Bytecode
  super_class: #5                   // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #5.#14   // java/lang/Object."<init>":()V
   #2 = Fieldref           #15.#16  // java/lang/System.out:Ljava/io/PrintStream;
   #3 = Methodref          #17.#18  // java/io/PrintStream.println:(I)V
... a lot of other constants ...
*/
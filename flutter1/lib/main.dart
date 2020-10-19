import 'package:flutter/material.dart';
import 'root.dart';

void main(){
  runApp(MaterialApp(
    home: RootPage(),
  ));
}

void main2(){
  runApp(Center(
    child: Text("你好吗",textDirection: TextDirection.ltr),
  ));
}
void main_() {
  runApp(
    Center(
      child: Text(
        'Hello, world!',
        textDirection: TextDirection.ltr,
      ),
    ),
  );
}

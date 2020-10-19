import 'package:flutter/material.dart';

class Home extends StatelessWidget {

  _starBtnTap(){
    //log
    print("_starBtnTap enter");
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: "你好",
        home: Scaffold(
          appBar: AppBar(
              title: Text("标题")
          ),
          body: Center(
            child: ListView(
              children: [
                Text("一"),
                Text("二"),
                Row(
                  children: [
                    Column(
                      children: [
                        IconButton(icon:Icon(Icons.star),onPressed: _starBtnTap,)
                      ],
                    )
                  ],
                )
              ],
            )
          ),

        )
    );
  }
}
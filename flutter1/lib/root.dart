import 'package:flutter/material.dart';
import 'login.dart';

class RootPage extends StatelessWidget {
  var ctx;
  goLogin(){
    print("goLogin enter...");
    Navigator.push(ctx, MaterialPageRoute(
      builder: (context)=> LoginPage()
    ));
  }

  @override
  Widget build(BuildContext context) {
    this.ctx = context;
    return Scaffold(
      appBar: AppBar(title: Text("首页")),
      body: ListView(
        children: <Widget>[
          RaisedButton(onPressed: goLogin, child: Text("登录"))
        ],
      ),
    );
  }

}
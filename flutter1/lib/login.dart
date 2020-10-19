import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert' as convert;
import 'package:shared_preferences/shared_preferences.dart';
import 'client.dart';

class LoginPage extends StatelessWidget {
  final c1 = TextEditingController();

//  final c2 = TextEditingController();
  var ctx;

  callLogin(final code) async {
    final url = "https://g-dev.dahezi.com/api/v1/user/login?code=$code";
    final resp = http.post(url);
    return resp;
  }

  onLoginTap() async {
    print("onLoginTap enter...");
    final code = c1.text;
    print("code: $code");
//    final url = "https://g-dev.dahezi.com/api/v1/user/login?code=$code";
//    final resp = await http.post(url);
//    print("resp:$resp");
//    if (resp.statusCode >= 200 && resp.statusCode < 300) {
//      final obj = convert.jsonDecode(resp.body);
//      print("obj:$obj");
//      final p = await SharedPreferences.getInstance();
//      final ok = await p.setString("authToken", obj["token"]);
//      if (ok) {
//        Navigator.pop(ctx);
//      }
//    } else {
//      print("error");
//    }
    final resp = await Client.instance().login(code);
    print("resp:$resp");
  }

  onBackTap() {
    print("onBacktap enter...");
    Navigator.pop(ctx);
  }

  @override
  Widget build(BuildContext context) {
    ctx = context;
    return Scaffold(
      appBar: AppBar(
        leading: IconButton(
          onPressed: onBackTap,
          icon: Icon(Icons.arrow_left),
        ),
      ),
      body: ListView(
        children: <Widget>[
          TextField(controller: c1),
//          TextField(controller: c2 ),
          RaisedButton(onPressed: onLoginTap, child: Text("登录"))
        ],
      ),
    );
  }
}

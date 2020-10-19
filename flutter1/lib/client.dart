import 'dart:convert';
import 'dart:io';

import 'package:http/http.dart' as http;
import 'package:shared_preferences/shared_preferences.dart';

class Client {
  SharedPreferences _p;
  String _authToken;
  static const _baseUrl = "https://g-dev.dahezi.com";

  static Client _minstance = null;

  static instance() {
    if (_minstance == null) {
      _minstance = Client();
    }
    return _minstance;
  }

  Client() {
    SharedPreferences.getInstance().then((v) {
      _p = v;
      _authToken = _p.get("authToken");
    });
  }

  Future<http.Response> post(String url, dynamic body) async {
    final headers = {HttpHeaders.authorizationHeader: _authToken};
    return http.post(url, headers: headers, body: body);
  }
  Future<http.Response> get(String url) async {
    final headers = {HttpHeaders.authorizationHeader: _authToken};
    return http.get(url);
  }

  Future<http.Response> login(String code) async {
    final url = "$_baseUrl/api/v1/user/login?code=$code";
    return post(url, null);
  }

  Future<HomeVo> home() async {
    final url ="$_baseUrl/api/v1/home";
    final resp = await get(url);
    final ret = HomeVo();
    final obj = jsonDecode(resp.body);
    ret.banner = obj["banners"];
    return ret;
  }

}

class HomeVo{
  List banner;
}

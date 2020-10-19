import UIKit


var msg = "你好吗"
for c in msg{
    print("\(c)")
}
let s = "\u{1F60E}"

let a = "\u{0061}\u{0301}"
print(a.lengthOfBytes(using: String.Encoding.unicode))
a.count

for s2 in msg.unicodeScalars{
    print("\(s2.debugDescription)")
}


let str : String? = "22"
if str != nil {
    let ss = str!
    print("str:\(ss)")
}else{
    print("nil")
}

if let ss = str {
    print("ss :\(ss)")
}

let errCode : String? = "403"
if let codeStr = errCode , let codeInt = Int(codeStr) , codeInt==404 {
    print("codeInt :\(codeInt)")
}else{
    print("unkown code \(errCode)")
}

var str2 : String?
str2?.append("11")

str2 ?? "no"


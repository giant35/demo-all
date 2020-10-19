var d1 : Dictionary<String,Int> = [:]
d1["one"]=1
d1
var d3 = [String:Int]()
d3["two"]=2

var d4 = ["one":1, "two":2]
d4
d4.count

d4["one"]
let s=d4["tt"]

for (k,v) in d4 {
    print("[\(k)]nn = \(v)")
}

let keys = Array(d4.keys)

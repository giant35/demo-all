var s1 : Set<Int> = [1,2,4]
var s2 : Set<Int> = [2,4,6]
s1.union(s2)

s1.intersection(s2)
s1.isDisjoint(with: s2)


s2.sorted { (i
    , j) -> Bool in
    i>j
}

s2.sorted(by: {$1 < $0})

s2.sorted {$1>$0}
s2

let s3 = s2.map{ $0 * 2}
s3
let s4 = s3.filter {$0%3==0}
s4

let s = s3.reduce(5) { (r :Int
    , i : Int) -> Int in
    return r+i
}
s

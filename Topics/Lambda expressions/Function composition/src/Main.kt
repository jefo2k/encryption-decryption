fun compose(g: (Int) -> Int, h: (Int) -> Int): (Int) -> Int = { x: Int -> g(h(x)) }
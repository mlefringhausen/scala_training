"hello" shouldBe "hello"

1 should not be 2

"hello" should startWith("hell")

numbers shouldBe 'empty

numbers should contain allOf(1, 2, 3)

numbers should contain inOrder(1, 2, 3)

an[Exception] should be thrownBy sys.error("BOOM")
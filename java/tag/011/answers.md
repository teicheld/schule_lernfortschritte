1: state and behavior				OK
2: fields					OK
3: methods					OK
4: encapsulation				OK
5: class					OK
6: method, interface, implements		WRONG
7: ?						WRONG
8: package					OK
9: Accessable Programming Interface		WRONG


Exercieses:

class book {

	int pages;
	int page;

	void readPage() {
		printOutPageSomehow();
	}

	void writePage(String[] text) {
		insertTextOnPageSomehow();
	}

	void turnPageForward() {
		page++;
	}

	void turnPageBackward() {
		page--;
	}

	void goToPage(int page) {
		page = this.page;
	}

}

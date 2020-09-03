
public class DecryptCaesarCipher {

public static StringBuffer decrypt(String str) {
	Main main = new Main();
	int key = main.inputKey();
	StringBuffer result = new StringBuffer();	
	for(int i = 0; i < str.length(); i++) {
		if(!Character.isWhitespace(str.charAt(i))) {
		char characterToBeUnscrambled = str.charAt(i);
		if(key > 0) {
		char unscrambledCharacter = (char)((int)(((characterToBeUnscrambled - 'Z') - key)%26) + 'Z');
		result.append(unscrambledCharacter);
		} else if(key < 0) {
			char unscrambledCharacter2 = (char)((int)(((characterToBeUnscrambled - 'Z') + key)%26) + 'Z');
			result.append(unscrambledCharacter2);
		}
	} else if(Character.isWhitespace(str.charAt(i))) {
		result.append(str.charAt(i));
		continue;
	}
	}
		return result;
	}

}

# Complete the function below.
# a = 97
# z = 122  
# A = 65
# Z = 90

def  decrypt(encrypted_message):
    key = "8251220"
    key_length = len(key)
    key_index = 0
    decrypted_message = ""
        
    for char in encrypted_message:
        if char.isalpha():
            char_code = ord(char)
            decrypted = char_code - int(key[key_index])
            
            begin = 65 if char_code <= 90 else 97
            end = 122 if begin >= 97 else 90
            
            if decrypted < begin:
                decrypted = end - (begin - decrypted) + 1
                
            decrypted_message += chr(decrypted)
            
            key_index += 1
            if key_index >= key_length:
                key_index = 0
        else:
            decrypted_message += char

    return decrypted_message
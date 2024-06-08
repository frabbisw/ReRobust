
from transformers import RobertaTokenizer, T5ForConditionalGeneration

from transformers import tokenization_utils

if __name__ == '__main__':

    tokenizer = RobertaTokenizer.from_pretrained('Salesforce/codet5-base')
    model = T5ForConditionalGeneration.from_pretrained('Salesforce/codet5-base')

    text = "def greet(user): print(f'hello <extra_id_0>!')"

    seq = tokenizer.tokenize("useInfo")
    print(seq)
    input_ids = tokenizer(text, return_tensors="pt").input_ids


    # simply generate one code span
    generated_ids = model.generate(input_ids, max_length=8)
    print(tokenizer.decode(generated_ids[0], skip_special_tokens=True))
    # this prints "{user.username}"
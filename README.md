# BasicAndroidEvalCalculator
Basic Android Eval Calculator

```java
ScriptEngineManager manager = new ScriptEngineManager();
ScriptEngine engine = manager.getEngineByName("js");
try{
    edit = (EditText) findViewById(R.id.editText);
    Object result = engine.eval(edit.getText().toString());
    edit.setText(result.toString());
}catch (ScriptException e) {
    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
    Log.d("Calculator", " ScriptEngine error: " + e.getMessage());
}
```

![WhatsApp Image 2020-03-02 at 10 55 46](https://user-images.githubusercontent.com/19695833/75656180-72310b80-5c74-11ea-8bbe-d125af1efbc0.jpeg)


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


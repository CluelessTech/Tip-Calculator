
# Tip Calculator


Creating  a simple **Tip Calculator** app. In which we will calculate the tip from the given percentage 


<table>
  <tr>
    <td> <img src="https://cluelesstech.github.io/Tip-Calculator/Tip%20Calculator%201.png"  alt="1" width = 360px height = 640px ></td>
    <td><img src="https://cluelesstech.github.io/Tip-Calculator/Tip%20Calculator%202.png" alt="2" width = 360px height = 640px></td>
    <td><img src="https://cluelesstech.github.io/Tip-Calculator/Tip%20Calculator%203.png" alt="2" width = 360px height = 640px></td>
   </tr> 
 
</table>


# Description 

Here user need to enter bill amount and then he/she need to select the percentage of bill amount which he/she wants to give as tip.
For example: If bill amount is 1000 and customer want to give 10% of 1000 as tip then it would select 10 in seekbar and after that need to click calculate button which would give 10% of 1000 i.e 100 as tip amount.



# Main Activity
```ruby
    if (!billAmount.getText().toString().equals("")) 
    {
	enterBillFloat = Float.parseFloat(billAmount.getText().toString());
	result = enterBillFloat * seekBarPercentage / 100;
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append("Your tip will be Rs." + String.valueOf(result) + "\n");
	stringBuilder.append("Total bill amount is Rs." + String.valueOf(enterBillFloat + result));
	resultTotal.setText(stringBuilder);
    } else {
	Toast.makeText(MainActivity.this, "Please enter bill amount", Toast.LENGTH_LONG).show();
    }

```
##  Watch the Full video on Youtube 
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/cIFjyJIzqy4/0.jpg)](https://www.youtube.com/embed/cIFjyJIzqy4)



## Follow for more updates
[Youtube ](https://www.youtube.com/c/CluelessTech05)
[GitHub](https://github.com/CluelessTech)
[Blog](https://cluelesstech05.blogspot.com/2020/09/creating-tip-calculator-app-in-android.html)



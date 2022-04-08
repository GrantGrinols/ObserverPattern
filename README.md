# ObserverPattern
A personal project that I did that fetches the stock market in real time. For the first two 'loops' there is an observer that updates prices with fake prices  to show that the observer itself is working in an offline scenario, that is, if a single price is changed, the entire list of prices is updated. Then the software prints out the stock prices to what it is in real time every two seconds. Together, you have a real-time observer.

The real time stock observer works by goes by fetching url links and reading the html code that was obtained from these links and stops when it detects a price. When the software sees this price, it sets that price and notifies the observer.

If you do not know what an Observer Pattern is, I suggest reading this first:
https://www.tutorialspoint.com/design_pattern/observer_pattern.htm

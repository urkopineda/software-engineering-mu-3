package edu.mondragon.easymock.test;

import edu.mondragon.easymock.stock.Portfolio;
import edu.mondragon.easymock.stock.Stock;
import edu.mondragon.easymock.stock.StockMarket;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.easymock.EasyMock.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static sun.nio.cs.Surrogate.is;

/**
 * Created by urko on 21/03/16.
 */
public class TestPortfolio {

    Portfolio portfolio = new Portfolio();
    StockMarket market = EasyMock.strictMock(StockMarket.class);

    @Before
    public void before() {
        portfolio.setStockMarket(market);
    }

    @Test
    public void nameGettersTest() {
        portfolio.setName("Name");
        assertEquals("Name not correctly set", "Name", portfolio.getName());
    }

    @Test
    public void addStocksTest() {
        List<Stock> stockList;
        Stock stock = new Stock("Stock1", 100);
        portfolio.addStock(stock);
        stockList = portfolio.getStocks();
        assertThat("Returned stock is not the one that was added", stockList.get(0), is(equalTo(stock)));
    }

    @Test
    public void stockMarketGettersTest() {
        StockMarket returnedMarket;
        portfolio.setStockMarket(market);
        returnedMarket = portfolio.getStockMarket();
        assertThat("Returned market is no the same as the one added", returnedMarket, is(equalTo(market)));
    }

    @Test
    public void setStockListTest() {
        List<Stock> stockList = new ArrayList<>();
        List<Stock> returnedStocks;
        Stock stock = new Stock("Stock1", 100);
        stockList.add(stock);
        portfolio.setStocks(stockList);
        returnedStocks = portfolio.getStocks();
        assertThat("Returned stocks aren't the inserted ones", returnedStocks.get(0), is(equalTo(stock)));
    }

    @Test
    public void getTotalValueTest() {
        Double expectedValue = 20.0;
        Double totalValue;
        portfolio.addStock(new Stock("Stock1", 1));
        portfolio.addStock(new Stock("Stock2", 1));
        resetToStrict(market);
        expect(market.getPrice("Stock1")).andReturn(10.0).times(1);
        expect(market.getPrice("Stock2")).andReturn(10.0).times(1);
        replay(market);
        totalValue = portfolio.getTotalValue();
        verify(market);
        assertEquals("Calculated total value is not the expected one", expectedValue, totalValue);
    }

}

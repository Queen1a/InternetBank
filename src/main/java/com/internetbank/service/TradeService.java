package com.internetbank.service;

import com.internetbank.pojo.Trade;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface TradeService {
    void insert(Trade trade);

    List<Trade> list(Integer cardId, Short type, LocalDateTime begin, LocalDateTime end);
}

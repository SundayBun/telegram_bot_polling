package com.example.telegram_bot_polling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

//@SpringBootApplication
public class TelegramBotPollingApplication {

    public static void main(String[] args) {
     //   SpringApplication.run(TelegramBotPollingApplication.class, args);
        ApiContextInitializer.init();

        FirstLongPollingBot firstLongPollingBot=new FirstLongPollingBot();
        TelegramBotsApi botsApi=new TelegramBotsApi();

        try {
botsApi.registerBot(firstLongPollingBot);

        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }

    }

}

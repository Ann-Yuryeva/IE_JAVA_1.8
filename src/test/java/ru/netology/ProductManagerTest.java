package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ProductManagerTest {

    @Mock
    ProductRepository repo;

    @InjectMocks
    ProductManager manager;

    @Test
    public void Save() {
        Product item = new Product(1, "Iphone");

        manager.add(item);

        verify(repo).save(item);
    }
}
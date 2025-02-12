package io.github.AlexsandroCS.TesteTecKR.domain.repository;

import io.github.AlexsandroCS.TesteTecKR.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByUsuarioId(Long idUsuario);
}

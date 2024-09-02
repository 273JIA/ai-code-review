package com.coding.middleware.sdk.infrastructure.openai;

import com.coding.middleware.sdk.infrastructure.openai.dto.ChatCompletionRequestDTO;
import com.coding.middleware.sdk.infrastructure.openai.dto.ChatCompletionSyncResponseDTO;

public interface IOpenAI {

    ChatCompletionSyncResponseDTO completions(ChatCompletionRequestDTO requestDTO) throws Exception;

}

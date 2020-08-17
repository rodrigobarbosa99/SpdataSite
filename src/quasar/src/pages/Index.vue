<template>
  <q-page class="q-pa-md">
<template>
  <template>
  <div class="q-pa-md">
    <q-carousel
      swipeable
      animated
      v-model="slide"
      :autoplay="autoplay"
      ref="carousel"
      infinite
    >
      <q-carousel-slide :name="1" img-src="~assets/Carrosel1.png" />
      <q-carousel-slide :name="2" img-src="~assets/Carrosel2.png" />
      <q-carousel-slide :name="3" img-src="~assets/Carrosel3.png" />      

      <template v-slot:control>
        <q-carousel-control
          position="top-right"
          :offset="[18, 18]"
          class="text-white rounded-borders"
          style="background: rgba(0, 0, 0, .3); padding: 4px 8px;"
        >
          <q-toggle dense dark color="orange" v-model="autoplay" label="Auto Play" />
        </q-carousel-control>

        <q-carousel-control
          position="bottom-right"
          :offset="[18, 18]"
          class="q-gutter-xs"
        >
          <q-btn
            push round dense color="orange" text-color="black" icon="arrow_left"
            @click="$refs.carousel.previous()"
          />
          <q-btn
            push round dense color="orange" text-color="black" icon="arrow_right"
            @click="$refs.carousel.next()"
          />
        </q-carousel-control>
      </template>
    </q-carousel>
  </div> 
 <div class="IMG01">   
   <q-tabs v-model="tab" align="center">
     <img src="~assets/IMG01.png" >          
    </q-tabs>    
 </div>

 

 <q-tabs v-model="tab" align="center"> 
 <div class="q-pa-md row items-start q-gutter-md">
   
     <q-card class="my-card" flat bordered>
       <q-card-section horizontal>
         <q-card-section class="q-pt-xs">          
           <div class="text-h5 q-mt-sm q-mb-xs">Sistemas para gestão de instituições de Saúde</div>
           <div class="text-caption text-grey">
             Sistemas e serviços para gestão de hospitais, clínicas, operadoras e saúde pública>
             Com soluções modularizadas e adaptáveis, a SPDATA possui sistemas capazes de se adequar perfeitamente aos diversos modelos de gestão e porte da instituição de saúde.
             Oferecemos soluções práticas e direcionadas à demanda de cada instituição de saúde, de modo personalizado, permitindo a otimização dos recursos, além de facilitar na tomada de decisões.
             <a id="g1-button-2" class="g1-button g1-button--medium g1-button--solid g1-button--standard " href="https://spdata.com.br/contato">Solicite uma demonstração</a>          
           </div>
         </q-card-section>  

         <q-card-section class="col-5 flex flex-center">
           <q-img
             class="rounded-borders"
             src="~assets/IMG02.png"
           />
         </q-card-section>
       </q-card-section>
      <q-separator />      
    </q-card>     
   </div>  
  </q-tabs>   
   
   <div class="solucoes">   
   <q-tabs v-model="tab" align="center">
     <h4><strong>Nossas Soluções</strong></h4>           
    </q-tabs>    
 </div> 
  <table border="0" align="center" id="Tableprodutos">
    <tr>     
     <td>
       <img width="320" height="180" src="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-320x180.jpeg" class="attachment-g1_one_third size-g1_one_third wp-post-image" alt="" loading="lazy" srcset="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-320x180.jpeg 320w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-300x169.jpeg 300w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-482x271.jpeg 482w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-239x134.jpeg 239w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH.jpeg 500w" sizes="(max-width: 320px) 100vw, 320px" >
			 <span class="g1-indicator g1-indicator-document"></span>       
     </td>
     <td>
       <img width="320" height="180" src="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGO-320x180.jpeg" class="attachment-g1_one_third size-g1_one_third wp-post-image" alt="" loading="lazy" srcset="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGO-320x180.jpeg 320w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGO-300x169.jpeg 300w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGO-482x271.jpeg 482w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGO-239x134.jpeg 239w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGO.jpeg 500w" sizes="(max-width: 320px) 100vw, 320px">
			 <span class="g1-indicator g1-indicator-document"></span>
      </td>
      <td>
       <img width="320" height="180" src="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos-320x180.jpeg" class="attachment-g1_one_third size-g1_one_third wp-post-image" alt="" loading="lazy" srcset="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos-320x180.jpeg 320w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos-300x169.jpeg 300w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos-482x271.jpeg 482w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos-239x134.jpeg 239w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos.jpeg 500w" sizes="(max-width: 320px) 100vw, 320px">        
      </td>
    </tr> 
    <tr>
     <td>
       <img width="320" height="180" src="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-PEP-320x180.jpeg" class="attachment-g1_one_third size-g1_one_third wp-post-image" alt="" loading="lazy" srcset="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-PEP-320x180.jpeg 320w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-PEP-300x169.jpeg 300w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-PEP-482x271.jpeg 482w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-PEP-239x134.jpeg 239w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-PEP.jpeg 500w" sizes="(max-width: 320px) 100vw, 320px">
     </td>
     <td>
       <img width="320" height="180" src="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Intelligence-BI-320x180.jpeg" class="attachment-g1_one_third size-g1_one_third wp-post-image" alt="" loading="lazy" srcset="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Intelligence-BI-320x180.jpeg 320w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Intelligence-BI-300x169.jpeg 300w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Intelligence-BI-482x271.jpeg 482w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Intelligence-BI-239x134.jpeg 239w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Intelligence-BI.jpeg 500w" sizes="(max-width: 320px) 100vw, 320px">
     </td>
     <td>
       <img width="320" height="180" src="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos-320x180.jpeg" class="attachment-g1_one_third size-g1_one_third wp-post-image" alt="" loading="lazy" srcset="https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos-320x180.jpeg 320w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos-300x169.jpeg 300w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos-482x271.jpeg 482w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos-239x134.jpeg 239w, https://secureservercdn.net/104.238.71.109/gba.217.myftpupload.com/wp-content/uploads/2017/07/Nova-logo-SGH-Suprimentos.jpeg 500w" sizes="(max-width: 320px) 100vw, 320px">
     </td>     
    </tr>  
    
  </table>  

  <div class="solucoes">   
   <q-tabs v-model="tab" align="center">
     <h4><strong>O que dizem os clientes</strong></h4>           
    </q-tabs>    
 </div>
   
     <div class="q-pa-md">
    <q-carousel 
      v-model="slide"
      vertical
      transition-prev="slide-down"
      transition-next="slide-up"
      swipeable
      animated
      control-color="white"
      navigation-icon="radio_button_unchecked"
      navigation
      padding
      arrows
      height="300px"
      class="bg-purple text-white shadow-1 rounded-borders"
    >
      <q-carousel-slide name="style" class="column no-wrap flex-center">
        <q-icon name="style" size="56px" />
        <div class="q-mt-md text-center">
          {{ lorem }}
        </div>
      </q-carousel-slide>
      <q-carousel-slide name="tv" class="column no-wrap flex-center">
        <q-icon name="live_tv" size="56px" />
        <div class="q-mt-md text-center">
          {{ lorem1 }}
        </div>
      </q-carousel-slide>
      <q-carousel-slide name="layers" class="column no-wrap flex-center">
        <q-icon name="layers" size="56px" />
        <div class="q-mt-md text-center">
          {{ lorem2 }}
        </div>
      </q-carousel-slide>
      <q-carousel-slide name="map" class="column no-wrap flex-center">
        <q-icon name="terrain" size="56px" />
        <div class="q-mt-md text-center">
          {{ lorem3 }}
        </div>
      </q-carousel-slide>
    </q-carousel>
  </div>
    
 

  
</template>
</template>
  </q-page>
</template>

<script>
export default {
  name: 'PageIndex',
  data () {
    return {
      slide: 1,
      autoplay: true
    }
    return {
      lorem: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.'
    }
    
  }    
}
</script>

<script>
export default {
  data () {
    return {
      slide: 'style',
      lorem: 'É bastante interessante participar do curso de capacitação, pois para mim o sistema é novo, haja vista, que assumi recentemente o cargo de gestora de TI, com certeza é um grande investimento profissional.',
      lorem1: 'Durante o curso de Faturamento de Convênios – Momento em que a SPDATA “posiciona e capacita” seus clientes com ferramentas e subsídios tecnológicos para garantir a eficácia na Gestão Hospitalar.',
      lorem2: 'O Software de Gestão Hospitalar da SPDATA é um ferramenta indispensável para gerir/administrar uma instituição de saúde com foco voltado para os processos institucionais. Outro ponto forte da empresa é o SAC que é nota 10.',
      lorem3: 'Todo Gestor precisa de muitas informações no seu dia a dia. E o sistema SPDATA é referência como fonte de informações gerenciais para a tomada das decisões.'
    }
  }
}
</script>


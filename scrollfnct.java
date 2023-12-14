      $(function () {
        $(document).scroll(function () {
          var $nav = $("#NaviBar");
          $nav.toggleClass("scrolled", $(this).scrollTop() > $nav.height());
        });
      });
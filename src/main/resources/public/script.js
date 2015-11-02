$(document).ready(function() {
  $('.box').on('click', function(event) {
    $('#winner').text('');
    var id = $(this).find('div').attr('id');
    var position = id.charAt(id.length - 1);

    $.ajax({
      type: 'post',
      url: '/setBox',
      data: {
        "position" : position
      }
      }).done(function(response) {
          game.setBoard(response);
      }).fail(function(err) {
    });

    $.ajax({
      type: 'post',
      url: '/setPlayer',
      data: null
      }).done(function(response) {
          changePlayer(response);
      }).fail(function(err) {
    });

    $.ajax({
      type: 'post',
      url: '/isWinner',
      data: null
      }).done(function(response) {
        if (response != '0') {
          displayWinner(response);
        };
      }).fail(function(err) {
    });
  });

  var form = $('form');
  form.submit(function( event ) {
    $.ajax({
        type: form.attr('method'),
        url: form.attr('action'),
        data: null
    }).done(function(response) {
        game.setBoard(response);
        changePlayer(1);
    }).fail(function() {

    });
    event.preventDefault();
    });
  });

  function changePlayer(player) {
    $('#player').text(player);
  }

  function displayWinner(winner) {
  if (winner == "1") {
    $('#winner').text('Player 1 is the winner!');
  } else if (winner == "2") {
    $('#winner').text('Player 2 is the winner!');
  } else if (winner == "3") {
    $('#winner').text("It's a Tie!");
  };
  var player = $('#player').text();
  $.ajax({
      type: 'post',
      url: '/restart',
      data: null
      }).done(function(response) {
        game.setBoard(response);
      }).fail(function(err) {
    });
  }

  game = {};

  game.setBoard = function(boardState) {
  $.each($('.box'), function(index) {
    $(this).find('div').removeClass('empty player-X player-O');
    switch(boardState.charAt(index)) {
      case '0':
        $(this).find('div').addClass('empty');
        break;
      case '1':
        $(this).find('div').addClass('player-X');
        break;
      case '2':
        $(this).find('div').addClass('player-O');
        break;
    }
  });
};
  